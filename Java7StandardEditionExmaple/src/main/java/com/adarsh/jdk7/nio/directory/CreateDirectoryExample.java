package com.adarsh.jdk7.nio.directory;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:38 PM
 * This Class provide the implementation for the functionality of..
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class CreateDirectoryExample {

    public static void main(String[] args) throws IOException {
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxrwx--x");
        FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(perms);
        Path path = Paths.get("D:", "Parent","Child");

        //This line of code will not work in Windows OS
        //Files.createDirectories(path,fileAttributes);

        //creates Directory as Directory as D:\Parent\Child
        Files.createDirectories(path);

        Path path1 = Paths.get("D:", "Parent","Child1");

        //creates Directory as Directory Child1 under  as D:\Parent
        Files.createDirectory(path1);

        //creates temp directory in file system temp directory
        Files.createTempDirectory("sampleTempDir");

        //creates temp directory in the specified path
        Files.createTempDirectory(path,"sampleTempDir");
    }

}

