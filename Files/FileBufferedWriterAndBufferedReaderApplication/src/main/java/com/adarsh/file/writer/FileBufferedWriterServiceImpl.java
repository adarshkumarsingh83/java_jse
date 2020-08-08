/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.writer;
/**
 *@Product: FileBufferedWriterService provides the specification for ..
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:02 AM
 * @see
 */

public class FileBufferedWriterServiceImpl implements FileBufferedWriterService {


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
        FileWriter fileWriter = new FileWriter(fileObject, appendMode);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(data);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
