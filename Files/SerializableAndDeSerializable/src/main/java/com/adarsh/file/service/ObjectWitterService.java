/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.service;
/**
 *@Product: ObjectWitterService provides the specification for ..
 */


import java.io.File;
import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 22/5/13 8:48 PM
 * @see
 */

public interface ObjectWitterService {

    public boolean writeObject(final List<Object> objectsList) throws Exception;

}
