/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.reader;
/**
 *@Product: FileInputStreamService provides the specification for ..
 */


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:01 AM
 * @see
 */

public class FileInputStreamServiceImpl implements FileInputStreamService {

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
        final byte[] data = new byte[DATA_SIZE];
        final List<String> dataList = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(fileObject);

        do {
            charRead = fileInputStream.read(data);
            if (charRead != 0) {
                dataList.add(new String(data).trim());
            }
        } while (charRead == DATA_SIZE);

        fileInputStream.close();
        return dataList;
    }
}
