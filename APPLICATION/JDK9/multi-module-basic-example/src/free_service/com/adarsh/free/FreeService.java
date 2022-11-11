package com.adarsh.free;

import com.adarsh.service.*;

public class FreeService implements Service {
    public void freeService() {
        System.out.println("Free Service Performed");
        doService();
    }
}
