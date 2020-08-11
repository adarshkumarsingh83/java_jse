/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.reader;
/**
 *@Product: FileReaderService provides the specification for ..
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 20/5/13 9:01 AM
 * @see
 */

public interface FileReaderService {

    public File getFile(final String fileName)throws FileNotFoundException;

    public List readData(final File fileObject)throws Exception;
}
