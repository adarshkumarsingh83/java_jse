package com.adarsh.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 11/27/12
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Application {

    public static void main(String[] args)throws Exception{
        ProcessBuilder processBuilder=new ProcessBuilder("notepad.exe",getFileName());
        processBuilder.start();
    }

    private static String getFileName()throws Exception{
        System.out.println("Enter the file Name To Open With Test Editor ");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }
}
