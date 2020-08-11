/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.writer;
/**
 *@Product: FileOutputStreamService provides the specification for ..
 */


import java.io.*;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:02 AM
 * @see
 */

public class FileOutputStreamServiceImpl implements FileOutputStreamService {


    @Override
    public File createFile(String fileName) throws Exception {
        File fileObject = new File(fileName);
        if (!fileObject.exists()) {
            fileObject.createNewFile();
        }
        return fileObject;
    }

    @Override
    public void writeData(File fileObject, boolean appendMode, final String data) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(fileObject, appendMode);
        fileOutputStream.write(data.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
