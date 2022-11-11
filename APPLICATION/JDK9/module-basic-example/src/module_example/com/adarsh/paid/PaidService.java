package com.adarsh.paid;
import com.adarsh.service.*;

public class PaidService implements Service {
    public void paidService(){
        System.out.println("Paid Service Performed");
        doService();
    }
}
