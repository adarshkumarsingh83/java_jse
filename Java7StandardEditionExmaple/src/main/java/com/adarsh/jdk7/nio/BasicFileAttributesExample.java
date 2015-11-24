package com.adarsh.jdk7.nio;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 11:07 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
public class BasicFileAttributesExample {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("D:/cp","BasicFileAttributesExample.java");
        BasicFileAttributes basicAttr = Files.readAttributes(file, BasicFileAttributes.class);
        FileTime creationTime = basicAttr.creationTime();
        System.out.println(creationTime);
        FileTime lastAccessTime = basicAttr.lastAccessTime();
        System.out.println(lastAccessTime);
        FileTime lastModifiedTime = basicAttr.lastModifiedTime();
        System.out.println(lastModifiedTime);
    }
}

