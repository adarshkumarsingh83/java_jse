package com.adarsh.jdk7.nio;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 10:59 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
public class WalkFileTreeCopyExample  {
    public static void main(String[] args) throws IOException {
        final Path sourceDir = Paths.get("D:/cp/source");
        final Path targetDir = Paths.get("D:/cp/dest");
        Files.walkFileTree(sourceDir, EnumSet.of(FileVisitOption.FOLLOW_LINKS), Integer.MAX_VALUE,
                new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException  {
                        Path target = targetDir.resolve(sourceDir.relativize(dir));
                        try {
                            Files.copy(dir, target);
                        } catch (FileAlreadyExistsException e) {
                            if (!Files.isDirectory(target))
                                throw e;
                        }
                        return FileVisitResult.CONTINUE;
                    }
                    @Override
                    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                        Files.copy(file, targetDir.resolve(sourceDir.relativize(file)));
                        return FileVisitResult.CONTINUE;
                    }
                });

    }
}
