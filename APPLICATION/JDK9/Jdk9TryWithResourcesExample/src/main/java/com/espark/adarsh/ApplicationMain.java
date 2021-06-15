package com.espark.adarsh;

import com.espark.adarsh.file.FileUtil;

import java.io.FileNotFoundException;

public class ApplicationMain {
    public static void main(String[] args) throws FileNotFoundException {
        final String fileName="/Users/akumar38/Desktop/applications/Jdk9TryWithResourcesExample/sample.txt";
        FileUtil fileUtil=new FileUtil();
        try(fileUtil) {
            fileUtil.writFile(fileName, "hi this is adarsh");
            String data = fileUtil.readFile(fileName);
            System.out.println("Response from file " + data);
        }catch (Exception e){
            System.out.println("Exception "+e.getLocalizedMessage());
        }
    }
}
