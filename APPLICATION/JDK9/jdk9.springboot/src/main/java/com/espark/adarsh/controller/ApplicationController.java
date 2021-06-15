package com.espark.adarsh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping(value = "/message/{msg}")
    public String getWish(@PathVariable("msg")String msg){
        return msg.toUpperCase();
    }
}
