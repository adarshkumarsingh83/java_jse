/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file;
/*
 * {@inheritDoc}
*/

/**
 * @Product : FileWriterAndReaderTest provide implementation of the specification
 *                    provided for the ...    
 */


import com.adarsh.file.reader.FileBufferedReaderService;
import com.adarsh.file.reader.FileBufferedReaderServiceImpl;
import com.adarsh.file.writer.FileBufferedWriterService;
import com.adarsh.file.writer.FileBufferedWriterServiceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:18 AM
 * @see
 */

public class FileWriterAndReaderTest {

    private final static BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
    private static FileBufferedWriterService fileWriterService;
    private static FileBufferedReaderService fileReaderService;


    static {
        fileWriterService = new FileBufferedWriterServiceImpl();
        fileReaderService = new FileBufferedReaderServiceImpl();
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Enter the File Name : ");
        String fileName = BUFFERED_READER.readLine();
        System.out.println("Do You Want to Override existing data Y|N ");
        boolean overrideFlag = (BUFFERED_READER.readLine().trim().equalsIgnoreCase("Y") ? false : true);
        File fileObject = fileWriterService.createFile(fileName);
        String fileData = getData();
        fileWriterService.writeData(fileObject, overrideFlag, fileData);
        fileObject = fileReaderService.getFile(fileName);
        List<String> fileDataList = fileReaderService.readData(fileObject);
        displayData(fileDataList);
    }

    private static String getData() throws Exception {
        String data = new String();
        System.out.println("Enter the Data : ");
        String temp = null;
        do {
            temp = BUFFERED_READER.readLine();
            if (!temp.trim().equalsIgnoreCase("stop")) {
                data = data + temp + "\n";
            }
        } while (!temp.trim().equalsIgnoreCase("stop"));
        return data;
    }

    private static void displayData(final List<String> data) {
        for (String fileData : data) {
            System.out.println(fileData);
        }
    }
}