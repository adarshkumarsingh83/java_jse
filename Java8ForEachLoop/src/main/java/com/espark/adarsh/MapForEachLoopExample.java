package com.espark.adarsh;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class MapForEachLoopExample {
    public static void main(String[] args) {
        final Map<String, String> map = new HashMap<String, String>() {
            {
                put("1key", "1value");
                put("2key", "2value");
                put("3key", "3value");
                put("4key", "4value");
                put("5key", "5value");
            }
        };

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

         /*1 approach*/
        final BiConsumer<String,String> biConsumer=new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " " + value);
            }
        };
        map.forEach(biConsumer);





         /*2 approach*/
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " " + value);
            }
        });



       /*3 approach*/
        map.forEach((String key,String value) -> { System.out.println(key + " " + value); });




        /*4 approach*/
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
