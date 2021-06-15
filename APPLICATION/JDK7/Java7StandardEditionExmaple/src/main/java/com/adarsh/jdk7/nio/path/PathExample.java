package com.adarsh.jdk7.nio.path;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:46 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {

        /*
           Path path = Paths.get("c:/temp/test.txt" );
           Path path = Paths.get("c:/temp","test.txt" );
           Path path = Paths.get("c:","temp/test.txt" );
           Path path = Paths.get("c:","temp","test.txt");

          Path path = FileSystems.getDefault().getPath("c:","temp","test.txt");
         */

        //Get the instance of Path
        Path path = Paths.get("d:", "temp", "test.txt");
        //Print the path attributes
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());

        //Gets File Object
        File f = path.toFile();
        System.out.println(f.getAbsoluteFile());

        //Read File wit the help of Path
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        String s = null;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
        }
    }
}