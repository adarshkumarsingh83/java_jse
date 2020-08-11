package com.adarsh.consumerproducer.store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 11:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyMessageStore {

    final private List<String> stringList = Collections.synchronizedList(new ArrayList<String>(10));

    public String getMessage() {
        return this.stringList.remove(0);
    }

    public void setMessage(final String message) {
        this.stringList.add(message);
    }

    public int getSize() {
        return this.stringList.size();
    }
}
