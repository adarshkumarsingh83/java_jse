/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.service;
/*
 * {@inheritDoc}
*/

/**
 * @Product : ObjectWitterServiceImpl provide implementation of the specification
 *                    provided for the ...    
 */


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 22/5/13 8:50 PM
 * @see
 */

public class ObjectWitterServiceImpl implements ObjectWitterService {

    private File fileObject = null;
    private boolean append = false;

    public ObjectWitterServiceImpl(final String fileName, final boolean append) throws IOException {
        this.fileObject = new File(fileName);
        this.append = append;
        if (!fileObject.exists()) {
            fileObject.createNewFile();
        }
    }

    @Override
    public boolean writeObject(final List<Object> objectsList) throws Exception {
        boolean result = false;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileObject, append);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Object object : objectsList) {
                objectOutputStream.writeObject(object);
            }

            result = true;
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        } finally {
            objectOutputStream.flush();
            objectOutputStream.close();
        }
        return result;
    }
}
