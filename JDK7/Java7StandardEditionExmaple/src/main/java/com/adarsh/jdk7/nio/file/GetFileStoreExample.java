package com.adarsh.jdk7.nio.file;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:50 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class GetFileStoreExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src\\main\\java\\com\\adarsh\\jdk7\\nio","Sample.txt");
        FileStore fileStore = Files.getFileStore(path);
        System.out.println(fileStore.getTotalSpace());
        System.out.println(fileStore.getUnallocatedSpace());
        System.out.println(fileStore.getUsableSpace());
    }
}