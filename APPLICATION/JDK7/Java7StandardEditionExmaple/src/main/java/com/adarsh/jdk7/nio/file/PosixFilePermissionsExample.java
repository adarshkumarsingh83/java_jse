package com.adarsh.jdk7.nio.file;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:52 PM
 * This Class provide the implementation for the functionality of..
 */

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilePermissionsExample {
    public static void main(String[] args) {
        Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x--x");
        FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(perms);
        System.out.println(fileAttributes.value());
    }
}