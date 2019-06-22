package com.espark.adarsh;

public class ApplicationMain {
    public static void main(String[] args) throws java.io.FileNotFoundException{
        java.io.File file=new java.io.File("/Users/akumar38/Desktop/");
        java.util.concurrent.ForkJoinPool pool = new java.util.concurrent.ForkJoinPool();
        FileSearchService fileSearchService=new FileSearchService(file,"FileSearchService.java");
        java.io.File response = pool.invoke(fileSearchService);

        System.out.println("\n\n\n");
        System.out.println("Response from the Search :=>\t"+response);
    }
}
