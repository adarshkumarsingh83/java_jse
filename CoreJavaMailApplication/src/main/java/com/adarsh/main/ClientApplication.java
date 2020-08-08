package com.adarsh.main;

import com.adarsh.service.MailClientWindow;

public class ClientApplication {


    public static void main(String[] args) throws Exception {
        try {
            new MailClientWindow().initialisation();
        } catch (Exception exceptionObject) {
            exceptionObject.printStackTrace();
        }
    }

}
		
   
		