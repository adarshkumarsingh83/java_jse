package com.adarsh.sample;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 18/2/13
 * Time: 9:35 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObservableEntityTest {

    @Test
    public void test() {

        // create observableEntity and observableEntityWatcher objects
        ObservableEntity observableEntity = new ObservableEntity("Original Value");

        // observableEntityWatcher object listens to object change
        ObservableEntityWatcher observableEntityWatcher = new ObservableEntityWatcher("Watcher");

        // add observer to the observableEntity object
        observableEntity.addObserver(observableEntityWatcher);

        // trigger value change
        System.out.println("setValue method called on Observable Entity ...");

        observableEntity.setValue("New 1 Value");
        observableEntity.setValue("New 2 Value");

        // check if value has changed
        if (observableEntity.hasChanged())
            System.out.println("Value changed");
        else
            System.out.println("Value not changed");
    }
}
