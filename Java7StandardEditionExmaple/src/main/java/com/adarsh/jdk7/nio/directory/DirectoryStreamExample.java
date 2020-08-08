package com.adarsh.jdk7.nio.directory;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:58 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class DirectoryStreamExample {
    public static void main(String[] args) throws IOException{
        DirectoryStream<Path> stream = null;
        try{
            Path dir = Paths.get("src\\main\\java\\com\\adarsh\\jdk7\\nio");
            stream = Files.newDirectoryStream(dir, "*.{java,txt,exe}");
            for (Path p: stream) {
                System.out.println(p.getFileName());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            stream.close();
        }
    }
}

