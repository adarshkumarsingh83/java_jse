package com.adarsh.jdk7.nio;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:44 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateLinkExample {

    public static void main(String[] args) throws IOException {
        Path existing = Paths.get("d:", "cp","file.txt");
        Path link = Paths.get("d:", "link");
        Path linkSym = Paths.get("d:", "linkSym");
        Files.createLink(link, existing);
        Files.createSymbolicLink(linkSym, existing);
    }
}
