package com.adarsh.jdk7.nio.file;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 11:06 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;
public class FileTimeExample {
    public static void main(String[] args) throws IOException {
        FileTime fileTime1 = FileTime.from(1600, TimeUnit.DAYS);
        System.out.println(fileTime1.toString());
        Path path = Paths.get("D:/cp");
        FileTime fileTime2 = Files.getLastModifiedTime(path, LinkOption.NOFOLLOW_LINKS);
        long l = fileTime2.to(TimeUnit.DAYS);
        System.out.println(l);
        int i = fileTime2.compareTo(fileTime1);
        System.out.println(i);
    }
}
