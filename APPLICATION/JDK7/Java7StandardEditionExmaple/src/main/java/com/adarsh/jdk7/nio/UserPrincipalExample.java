package com.adarsh.jdk7.nio;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 11:12 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
public class UserPrincipalExample {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("src\\main\\java\\com\\adarsh\\jdk7\\nio","Sample.txt");
        UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
        UserPrincipal owner = lookupService.lookupPrincipalByName("adarsh");
        Files.setOwner(file, owner);
        UserPrincipal userPrincipal =  Files.getOwner(file);
        System.out.println(userPrincipal.getName());
    }
}