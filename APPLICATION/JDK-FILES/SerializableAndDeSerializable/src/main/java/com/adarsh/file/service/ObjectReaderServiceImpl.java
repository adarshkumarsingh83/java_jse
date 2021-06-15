/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.service;
/**
 *@Product: ObjectReaderService provides the specification for ..
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 22/5/13 8:59 PM
 * @see
 */

public class ObjectReaderServiceImpl implements ObjectReaderService {

    private File fileObject = null;

    public ObjectReaderServiceImpl(final String fileName) throws FileNotFoundException {
        this.fileObject = new File(fileName);
        if (!fileObject.exists()) {
            throw new FileNotFoundException(fileName);
        }
        if (!fileObject.canRead()) {
            throw new RuntimeException("Unable to Read the File " + fileName);
        }
    }

    @Override
    public List<Object> readObject() throws Exception {
        final List<Object> objectsList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileObject);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = null;
            do {
                object = objectInputStream.readObject();
                objectsList.add(object);
            } while (object != null);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            fileInputStream.close();
            objectInputStream.close();
        }
        return objectsList;
    }
}
