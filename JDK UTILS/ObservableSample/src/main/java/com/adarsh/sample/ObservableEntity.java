package com.adarsh.sample;

import java.util.Observable;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 18/2/13
 * Time: 9:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObservableEntity extends Observable {

    private String watchedValue;

    public ObservableEntity(String value) {
        watchedValue = value;
    }

    public void setValue(String value) {
       // if value has changed notify observers
        if(!watchedValue.equals(value)) {
            watchedValue = value;
           // mark as value changed
            setChanged();
        }
    }
}
