package com.espark.adarsh.service;

import com.espark.adarsh.util.ServiceUtil;

public class WishServiceImpl implements WishService{

    @Override
    public String getWishMessage(String name){
        ServiceUtil serviceUtil=new ServiceUtil();
         return serviceUtil.getUpper("welcome to the espark "+name);
    }
}
