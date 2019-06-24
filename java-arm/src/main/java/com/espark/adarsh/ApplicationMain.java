package com.espark.adarsh;

public class ApplicationMain {

    public static void main(String[] args) {

        try(Resource database=new Resource("database") ) {
            database.doWork();
        }

        System.out.println();
        try(Resource file=new Resource("file") ) {
            file.doWork();
        }

        System.out.println();
        try(Resource jms=new Resource("jms") ) {
            jms.doWork();
        }
    }
}
