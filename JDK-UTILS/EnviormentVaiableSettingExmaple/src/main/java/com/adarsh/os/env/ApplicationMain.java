package com.adarsh.os.env;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by Adarsh on 4/21/15.
 */
public class ApplicationMain {
    public static void main(String[] args) {
       /* OsEnvironmentVariableService osEnvironmentVariableService = new OsEnvironmentVariableService();
        osEnvironmentVariableService.setEnv(new HashMap() {{
           put("APPLICATION_HOME_ONE","D:/ADARSH/APPLICATION_HOME");
        }});*/


        //export MY_APPLICATION_HOME="/HOME/MY_APPLICATION_HOME"
        //setx MY_APPLICATION_HOME D:/MY_APPLICATION/HOME

        try {
            Process process = Runtime.getRuntime().exec("setx MY_APPLICATION_HOME D:/MY_APPLICATION/HOME");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = reader.readLine()) != null) {
                System.out.println("The inout stream is " + s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}