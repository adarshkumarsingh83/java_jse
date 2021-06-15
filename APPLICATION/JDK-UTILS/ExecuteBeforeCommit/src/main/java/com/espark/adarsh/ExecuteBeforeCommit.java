package com.espark.adarsh;

import org.apache.commons.io.FileDeleteStrategy;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ExecuteBeforeCommit {
    final static List<String> fileTypes = Arrays.asList(".iml", ".log", ".mvn");
    final static List<String> dirTypes
            = Arrays.asList("target", "log", "build", "out", "node_modules", ".idea", ".gradle");


    public static void main(String[] args) {
        File rootFile = new java.io.File(Paths.get(".").toAbsolutePath().normalize().toString());
        traverse(rootFile);
    }

    public static void traverse(File file) {
        String fileName = file.getName();
        try {
            if (file.isDirectory()) {
                if (dirTypes.contains(fileName)) {
                    System.out.println(file.getAbsolutePath() + " Dir Delete");
                    FileDeleteStrategy.FORCE.delete(file);
                } else {
                    File[] filesInDir = file.listFiles();
                    for (File fileinDir : filesInDir) {
                        traverse(fileinDir);
                    }
                }
            } else {
                if (fileTypes.stream().anyMatch(entry -> fileName.endsWith(entry))) {
                    System.out.println(file.getAbsolutePath() + " File Delete");
                    FileDeleteStrategy.FORCE.delete(file);
                }
            }
        } catch (Exception io) {
            System.out.println(file.getAbsolutePath() + " " + io.getMessage());
        }
    }
}

