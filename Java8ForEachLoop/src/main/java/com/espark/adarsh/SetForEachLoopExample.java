package com.espark.adarsh;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class SetForEachLoopExample {
    public static void main(String[] args) {
        final Set<Integer> hashSet = new HashSet<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };

        final Iterator<Integer> iterator= hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*1 approach*/
        final Consumer<Integer> consumer= new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        hashSet.forEach(consumer);


        /*2 approach*/
        hashSet.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        /*3 approach*/
        hashSet.forEach((Integer value) -> {
            System.out.println(value);
        });

        /*4 approach*/
        hashSet.forEach((value) -> System.out.println(value));



        /*5 approach*/
        hashSet.forEach(value -> System.out.println(value));


        /*6 approach*/
        hashSet.forEach(System.out::println);
    }
}
