package com.espark.adarsh.api;

import com.espark.adarsh.service.WishService;
import com.espark.adarsh.service.WishServiceImpl;

public class CustomerService {

    public static void main(String[] args) {
        WishService wishService=new WishServiceImpl();
        System.out.println(wishService.getWishMessage(System.getProperty("user.name")));
    }
}
