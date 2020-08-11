/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.writer;
/**
 *@Product: FileBufferedWriterService provides the specification for ..
 */


import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:02 AM
 * @see
 */

public interface FileBufferedWriterService {

    public File createFile(final String fileName) throws Exception;

    public void writeData(final File fileObject, boolean appendMode, final String data) throws Exception;
}
