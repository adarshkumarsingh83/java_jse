package com.espark.adarsh.service;

import java.time.LocalDateTime;

public class WishServiceImpl implements WishService {
    public String wish(String name) {
        int hour = LocalDateTime.now().getHour();
        if (hour > 5 && hour < 12) {
            return name + " Good Morning ";
        } else if (hour > 12 && hour < 16) {
            return name + " Good Afternoon ";
        } else {
            return name + " Good Evening ";
        }
    }
}
