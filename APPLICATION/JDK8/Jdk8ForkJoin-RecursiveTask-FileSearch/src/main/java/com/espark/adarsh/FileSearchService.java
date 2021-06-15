package com.espark.adarsh;

import java.util.*;

public class FileSearchService extends java.util.concurrent.RecursiveTask<java.io.File> {

    private java.io.File file;
    private String fileName;

    private java.io.File findFile=null;
    private static boolean resultFound=false;

    public FileSearchService(java.io.File dir, String name) throws java.io.FileNotFoundException {
        if (dir != null && dir.exists()) {
            this.file = dir;
            this.fileName = name;
        } else {
            throw new java.io.FileNotFoundException("File Not found ");
        }
    }

    static long index = 0L;

    @Override
    protected java.io.File compute() {
        index += 1;
        System.out.println((index) + ":=> " + this.file.getAbsolutePath());
        if(!resultFound) {
            if (file.isDirectory()) {
                try {
                    java.util.List<FileSearchService> list = getDirContent(file);
                    java.util.Collection<com.espark.adarsh.FileSearchService> searchServicesResponse
                            = java.util.concurrent.ForkJoinTask.invokeAll(list);

                    Set<FileSearchService> set= searchServicesResponse.stream().filter(search -> search.getFindFile()!=null)
                            .collect(java.util.stream.Collectors.toSet());
                    if(!set.isEmpty()) {
                        findFile = set.iterator().next().getFindFile();
                    }

                } catch (java.io.FileNotFoundException e) {
                    e.printStackTrace();
                }
            } else {
                if (file.getName().equals(this.fileName)) {
                    findFile=file;
                    resultFound=true;
                }
            }
        }
        return findFile;
    }

    public java.io.File getFindFile() {
        return findFile;
    }

    private List<FileSearchService> getDirContent(java.io.File dir) throws java.io.FileNotFoundException {
        List<FileSearchService> tasks = new ArrayList<>();
        if (dir.isDirectory()) {
            java.io.File[] files = dir.listFiles();
            for (java.io.File file : files) {
                tasks.add(new FileSearchService(file, fileName));
            }
        } else {
            tasks.add(new FileSearchService(dir, fileName));
        }
        return tasks;
    }
}
