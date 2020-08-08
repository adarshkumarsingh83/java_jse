/*
 * Copyright © MeritTrac Services Pvt. Ltd.
 * All Rights Reserved.
 */

package com.adarsh.file.service;
/**
 *@Product: ObjectReaderService provides the specification for ..
 */


import java.util.List;

/**
 * @author $CreatedBy Adarsh_K
 * @author $LastChangedBy: Adarsh_K
 * @version $Revision: 1.0 $, $Date:: 22/5/13 8:59 PM
 * @see
 */

public interface ObjectReaderService {
    public List<Object> readObject()throws Exception;
}
