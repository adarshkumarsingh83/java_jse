package com.espark.adarsh;

import com.espark.adarsh.bean.Category;
import com.espark.adarsh.bean.Product;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
   final static List<Category> categoryList = List.of(
            Category.builder().categoryName("mens").categoryId("1").build(),
            Category.builder().categoryName("women").categoryId("2").build(),
            Category.builder().categoryName("kids").categoryId("3").build()
    );

   final static List<Product> productList =  List.of(
           Product.builder().productName("shirt").productPrice(7.11f).categoryId("1").build(),
           Product.builder().productName("shirt").productPrice(12.23f).categoryId("2").build(),
           Product.builder().productName("shirt").productPrice(9.87f).categoryId("3").build(),
           Product.builder().productName("pant").productPrice(10.20f).categoryId("1").build(),
           Product.builder().productName("pant").productPrice(15.30f).categoryId("2").build(),
           Product.builder().productName("pant").productPrice(12.08f).categoryId("3").build()
   );
    public static void main(String[] args) {
      Map<String,String> categoryIdName =  categoryList.stream()
               .collect(Collectors.toMap(Category::getCategoryId,Category::getCategoryName));

        System.out.println(categoryIdName);
        Map<String,Float> result = productList.stream().collect(Collectors.groupingBy(Product::getCategoryId,LinkedHashMap::new,
                Collectors.toList()))
                .entrySet().stream().collect(Collectors.toMap(entry -> categoryIdName.get(entry.getKey()),
                        entry -> entry.getValue().stream().map(Product::getProductPrice).reduce(0.0f, Float::sum)));
        System.out.println(result);
    }
}
