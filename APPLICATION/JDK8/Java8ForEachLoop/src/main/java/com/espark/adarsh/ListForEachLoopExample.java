package com.espark.adarsh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ListForEachLoopExample {

    public static void main(String[] args) {

        final List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(int value:list){
            System.out.println(value);
        }


        final Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*1 approach*/
        final Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        };
        list.forEach(consumer);



          /*2 approach*/
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });



          /*3 approach*/
        list.forEach((Integer value) -> {
            System.out.println(value);
        });



          /*4 approach*/
        list.forEach((value) -> System.out.println(value));


          /*5 approach*/
        list.forEach(value -> System.out.println(value));


          /*6 approach*/
        list.forEach(System.out::println);
    }
}
