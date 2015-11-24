/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.reader;
/**
 *@Product: FileBufferedReaderService provides the specification for ..
 */


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:01 AM
 * @see
 */

public class FileBufferedReaderServiceImpl implements FileBufferedReaderService {

    @Override
    public File getFile(String fileName) throws FileNotFoundException {
        final File fileObject = new File(fileName);
        if (!fileObject.exists()) {
            throw new FileNotFoundException(fileName);
        }
        return fileObject;
    }

    @Override
    public List readData(File fileObject) throws Exception {
        int charRead = 0;
        final int DATA_SIZE = 1024;
        final char[] data = new char[DATA_SIZE];
        final List<String> dataList = new ArrayList<>();
        FileReader fileReader = new FileReader(fileObject);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        do {
            charRead = bufferedReader.read(data);
            if (charRead != 0) {
                dataList.add(new String(data).trim());
            }
        } while (charRead == DATA_SIZE);

        bufferedReader.close();
        return dataList;
    }
}
