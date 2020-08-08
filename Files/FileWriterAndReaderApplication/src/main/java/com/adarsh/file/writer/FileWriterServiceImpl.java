/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.writer;
/**
 *@Product: FileWriterService provides the specification for ..
 */


import java.io.File;
import java.io.FileWriter;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:02 AM
 * @see
 */

public class FileWriterServiceImpl implements FileWriterService {


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
        fileWriter.write(data);
        fileWriter.flush();
        fileWriter.close();
    }
}
