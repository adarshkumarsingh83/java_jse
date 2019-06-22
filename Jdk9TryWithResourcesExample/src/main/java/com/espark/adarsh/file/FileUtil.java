package com.espark.adarsh.file;

import java.io.*;

public class FileUtil implements AutoCloseable{

    public String readFile(String fileName) throws FileNotFoundException {
        String data = "";
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(fileName);
        }

        String line = null;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //jdk 9 try with resource
        try (bufferedReader;fileReader) {
            do {
                line = bufferedReader.readLine();
                if(line!=null) {
                    data = data + line;
                }
            } while (line != null);
        } catch (IOException e) {
            System.out.println("Exception => " + e.getLocalizedMessage());
        }

        finally {
            try(bufferedReader;fileReader) {
                fileReader.close();
                bufferedReader.close();
            }catch (IOException e){
                System.out.println("Exception => " + e.getLocalizedMessage());
            }
        }
        return data;
    }

    public void writFile(String fileName, String data) {
        File file = new File(fileName);

        //before jdk 7
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Exception => " + e.getLocalizedMessage());
            throw new RuntimeException("Unable to Open or Crate a File " + fileName);
        }

        //jdk 7 try with resource
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); ) {

            bufferedWriter.write(data);
            bufferedWriter.flush();

            //jdk 9 try with resource
            try(fileWriter;bufferedWriter) {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                System.out.println("Exception => " + e.getLocalizedMessage());
            }

        } catch (IOException e) {
            System.out.println("Exception => " + e.getLocalizedMessage());
            throw new RuntimeException("Unable to Write into File " + fileName);
        }
    }

    @Override
    public void close() throws Exception {
        System.out.printf("Closing the FileUtil");
    }
}
