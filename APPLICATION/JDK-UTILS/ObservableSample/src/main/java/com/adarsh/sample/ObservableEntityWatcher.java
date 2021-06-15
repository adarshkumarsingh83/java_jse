package com.adarsh.sample;

import java.util.Observable;
import java.util.Observer;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 18/2/13
 * Time: 9:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObservableEntityWatcher implements Observer {

    public String name;

    public ObservableEntityWatcher(String name) {
        this.name = name;
    }

    public void update(Observable obj, Object arg) {
        System.out.println("Update called");
        System.out.println("Class Modified :-> "+obj.getClass()+" "+arg.toString());
    }
}