package com.espark.adarsh;

import java.util.ServiceLoader;
import com.espark.adarsh.service.WishService;

public class ApplicationMain {
    public static void main(String[] args) {
        Iterable<WishService> services = ServiceLoader.load(WishService.class);
        WishService service = services.iterator().next();
        System.out.println(service.wish(System.getProperty("user.name")));
    }
}
