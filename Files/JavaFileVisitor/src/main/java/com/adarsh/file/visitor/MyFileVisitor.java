package com.adarsh.file.visitor;

import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created with IntelliJ IDEA.
 * User: adarsh_k
 * Date: 1/12/14
 * Time: 1:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyFileVisitor {

    public static void searchFile(final String dirPath, final String fileName) throws Exception {

        final Path searcPath = Paths.get(dirPath);
        final Path findFile = Paths.get(fileName);

        FileVisitor visitor = new SimpleFileVisitor() {

            public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {

                if (path.getName(0).startsWith(findFile)) {
                    System.out.println("file found");
                }

                return FileVisitResult.CONTINUE;
            }
        };
        Files.walkFileTree(searcPath, visitor);
    }

    public static void main(String[] args)throws Exception{
        searchFile("c:/","my.txt");
    }
}
