package com.adarsh.jdk7.nio;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:30 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferedReaderExample {
    public static void main(String[] args) throws IOException {

        try {
            //Get the instance of Path
            Path path = Paths.get("src\\main\\java\\com\\adarsh\\jdk7\\nio", "Sample.txt");
            //opens the file to read
            BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            String s = null;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        }catch (FileNotFoundException  e){
            e.printStackTrace();
        }
    }
}
