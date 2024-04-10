package com.espark.adarsh.bean;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {

    String categoryId;
    String productName;
    Float productPrice;

}
