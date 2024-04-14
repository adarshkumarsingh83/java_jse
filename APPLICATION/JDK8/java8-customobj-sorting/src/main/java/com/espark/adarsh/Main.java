package com.espark.adarsh;

import com.espark.adarsh.bean.Category;
import com.espark.adarsh.bean.Product;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.summingDouble;

public class Main {
   final static List<Category> categoryList = List.of(
            Category.builder().categoryName("mens").categoryId("1").build(),
            Category.builder().categoryName("women").categoryId("2").build(),
            Category.builder().categoryName("kids").categoryId("3").build(),
            Category.builder().categoryName("old").categoryId("4").build()
    );

   final static List<Product> productList =  List.of(
           Product.builder().productName("shirt").productPrice(7.11d).categoryId("1").build(),
           Product.builder().productName("shirt").productPrice(12.23d).categoryId("2").build(),
           Product.builder().productName("shirt").productPrice(9.87d).categoryId("3").build(),
           Product.builder().productName("pant").productPrice(10.20d).categoryId("1").build(),
           Product.builder().productName("pant").productPrice(15.30d).categoryId("2").build(),
           Product.builder().productName("pant").productPrice(12.08d).categoryId("3").build()

   );
    public static void main(String[] args) {
      Map<String,String> categoryIdName =  categoryList.stream()
               .collect(Collectors.toMap(Category::getCategoryId,Category::getCategoryName));

        System.out.println(categoryIdName);
        Map<String,Double> result = productList.stream().collect(Collectors.groupingBy(Product::getCategoryId,LinkedHashMap::new, Collectors.toList()))
                .entrySet().stream()
                .collect(Collectors.toMap(entry -> categoryIdName.get(entry.getKey()),
                        entry -> entry.getValue().stream().map(Product::getProductPrice).reduce(0.0d, Double::sum)));
        System.out.println(result);


        Map<String,List< Product>> productByCategory = productList.stream().collect(Collectors.groupingBy(Product::getCategoryId,LinkedHashMap::new, Collectors.toList()));
        Map<String,Double> result1 = categoryIdName.entrySet().stream()
                .collect((Map.Entry<String,String> entry)-> Collectors.toMap(entry.getValue(),
                   Main.sum(productByCategory,entry.getKey())
                ));


    }

    public static Double sum(Map<String,List< Product>> map,String key){
             return map.get(key).stream().mapToDouble(Product::getProductPrice).sum();
    }
}
