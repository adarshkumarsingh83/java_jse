package com.adarsh.os.env;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Adarsh on 4/21/15.
 */
public class OsEnvironmentCadSetter {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) {
        boolean execute = false;
        List<String> cmd=new ArrayList<String>();
        System.out.println(OS);
        if (isWindows()) {
            System.out.println("This is Windows");
             cmd.add("setx MY_APPLICATION_HOME D:/MY_APPLICATION/HOME");
            execute=true;
        } else if (isMac()) {
            System.out.println("This is Mac");
            cmd.add("export 'MY_APPLICATION_HOME=/HOME/MY_APPLICATION_HOME'");
            execute=true;
        } else if (isUnix()) {
            System.out.println("This is Unix or Linux");
            cmd.add("/bin/bash");
            cmd.add("cd /");
            cmd.add("export MY_APPLICATION_HOME = /home/adarsh");
            execute=true;
        }  else {
            System.out.println("Your OS is not support!!");
        }

        if (execute) {
            try {
                String[] str=new String[cmd.size()];
                cmd.toArray(str);
                Process process = Runtime.getRuntime().exec(str);
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String s;
                while ((s = reader.readLine()) != null) {
                    System.out.println("The inout stream is " + s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isWindows() {

        return (OS.indexOf("win") >= 0);

    }

    public static boolean isMac() {

        return (OS.indexOf("mac") >= 0);

    }

    public static boolean isUnix() {

        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);

    }

}
