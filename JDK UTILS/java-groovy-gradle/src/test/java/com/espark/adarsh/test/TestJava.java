package com.espark.adarsh.test;

import static org.junit.Assert.assertTrue;

import com.espark.adarsh.Utils;
import org.junit.Before;
import org.junit.Test;

public class TestJava {

    private Utils  utils;

    @Before
    public void init(){
        utils = new Utils();
    }

    @Test
    public void testUtil() {

        String response = utils.getMessage();

        assertTrue(response.equals(System.getProperty("user.name"+"welcome")));
    }

}

