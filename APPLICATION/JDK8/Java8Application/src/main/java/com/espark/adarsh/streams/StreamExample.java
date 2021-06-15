package com.espark.adarsh.streams;

import com.espark.adarsh.utils.SupplierExample;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class StreamExample {

    /**
     * Stream.forEach and Stream.forEachOrdered
     * forEach method accepts consumer as an argument and that consumer is applied to each element of the stream.
     * We can create a consumer to print the stream element and use it with forEach method.
     * forEachOrdered method does the same thing but in the encounter order of the stream.
     */
    @Test
    public void forEach() {
        System.out.println("forEach Demo");
        Stream.of("AAA", "BBB", "CCC").forEach(s -> System.out.println("Output:" + s));
        System.out.println("forEachOrdered Demo");
        Stream.of("AAA", "BBB", "CCC").forEachOrdered(s -> System.out.println("Output:" + s));
    }

    /**
     * Stream.peek
     * peek returns stream itself after applying the action passed as consumer object.
     */
    @Test
    public void peek() {
        List<Integer> list = Arrays.asList(10, 11, 12);
        list.stream().peek(i -> System.out.println(i * i)).collect(Collectors.toList());
    }

    /**
     * Stream.skip
     * skip is a method that skips given number of element from the stream object from start.
     */
    @Test
    public void skip() {
        List<String> list = Arrays.asList("AA", "BB", "CC", "DD");
        list.stream().skip(2).forEach(s -> System.out.println(s));
    }

    /**
     * Stream.toArray
     * Stream.toArray method converts a stream into array.
     */
    @Test
    public void toArray() {
        Object[] ob = Stream.of("A", "B", "C", "D").toArray();
        for (Object o : ob) {
            System.out.println(o.toString());
        }
    }

    /**
     * Stream.of
     * Stream.of is a method which returns sequential ordered stream.
     * We can pass any object comma separated and will get stream object.
     */
    @Test
    public void streamOf() {
        Stream.of("Adarsh", "Amit", "Radha").forEach(s -> System.out.println(s));
    }

    /**
     * Stream.flatMap
     * Stream.flatMap returns the stream object. We need to pass a function as an argument.
     * Function will be applied to each element of stream.
     */
    @Test
    public void flatMap() {
        List<String> list1 = Arrays.asList("AAA", "BBB");
        List<String> list2 = Arrays.asList("CCC", "DDD");
        Stream.of(list1, list2).flatMap(list -> list.stream()).forEach(s -> System.out.println(s));
    }

    /**
     * Stream.generate
     * Stream.generate returns infinite sequential and unordered stream. We need to pass supplier to generate element.
     */
    @Test
    public void generate() {
        class Item {
            private String name;

            public Item(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }
        }
        Item item = new Item("AA");
        Stream<String> stream = Stream.generate(item::getName);
        stream.forEach(s -> System.out.println(s));
    }

    /**
     * Stream.findAny
     * findAny method can find any element from stream. It returns Optional instance.
     * If there is no data in stream, it returns empty Optional instance.
     */
    @Test
    public void findAny() {
        List<String> list = Arrays.asList("AA", "BB", "CC");
        list.stream().findAny().ifPresent(s -> System.out.println(s));
    }

    /**
     * Stream.findFirst
     * findFirst method returns first element of the stream as an Optional instance.
     * If stream is empty, it returns empty Optional instance.
     */
    @Test
    public void findFirst() {
        List<String> list = Arrays.asList("XX", "YY", "ZZ");
        list.stream().findFirst().ifPresent(s -> System.out.println(s));
    }

    /**
     * Stream.limit
     * limit method of stream API, returns stream instance with the given number of element in limit as an argument.
     * limit method selects the elements from start.
     */
    @Test
    public void limit() {
        List<String> list = Arrays.asList("AA", "BB", "CC", "DD", "EE");
        list.stream().limit(3).forEach(s -> System.out.println(s));
    }

    /**
     * Stream.max
     * max method returns maximum element on the basis of given comparator. It returns Optional instance
     */
    @Test
    public void max() {
        class StringComparator implements Comparator<String> {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        }
        List<String> list = Arrays.asList("AA", "DD", "CC", "BB");
        list.stream().max(new StringComparator()).ifPresent(s -> System.out.println(s));
    }

    /**
     * Stream.min
     * min method returns minimum element on the basis of given comparator. It returns Optional instance.
     */
    @Test
    public void min() {
        class StringComparator implements Comparator<String> {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        }
        List<String> list = Arrays.asList("CC", "DD", "AA", "BB");
        list.stream().min(new StringComparator()).ifPresent(s -> System.out.println(s));
    }

    /**
     * Stream.concat
     * concat() is a static method in stream API. It concats two stream object and returns resulting stream object.
     * In our example we have two lists which are converted into stream and then concatenated.
     */
    @Test
    public void concat() {
        List<String> list1 = Arrays.asList("A1", "A2", "A3");
        List<String> list2 = Arrays.asList("B1", "B2", "B3");
        Stream<String> resStream = Stream.concat(list1.stream(), list2.stream());
        resStream.forEach(s -> System.out.println(s));
    }

    /**
     * Stream.count
     * count() method in stream API just counts the elements in stream object. It returns long value.
     * In our example we have a list and we convert it into stream then apply count() method on it.
     */
    @Test
    public void count() {
        List<String> list = Arrays.asList("AA", "AB", "CC");
        Predicate<String> predicate = s -> s.startsWith("A");
        long l = list.stream().filter(predicate).count();
        System.out.println("Number of Matching Element:" + l);
    }

    /**
     * Stream.sorted
     * sorted() method in stream API sorts the elements of stream on the basis of natural order.
     * We can also pass our comparator object to get custom sorting.
     */
    @Test
    public void sorted() {
        List<String> list = Arrays.asList("DC", "CD", "AD");
        list.stream().sorted().forEach(s -> System.out.println(s));
    }

    /**
     * Stream.distinct
     * distinct() method in stream API returns stream with distinct element. D
     * istinct element is decided by equal method of Object class.
     */
    @Test
    public void distinct() {
        List<String> list = Arrays.asList("AA", "AA", "BB");
        long l = list.stream().distinct().count();
        System.out.println("Number of distinct element:" + l);
    }

    /**
     * Stream.allMatch
     * We pass predicate as an argument to allMatch method. That predicate is applied to each element of stream
     * and if each and every element satisfies the predicate then it returns true otherwise false.
     * <p>
     * Stream.anyMatch
     * For anyMatch method we pass predicate as an argument. The element of stream is iterated for this predicate.
     * If any element matches then it returns true otherwise false.
     * <p>
     * Stream.noneMatch
     * noneMatch method is a method which takes argument as a predicate and if none of element of stream matches
     * the predicate, then it returns true else false.
     */
    @Test
    public void match() {

        class Employee {
            public int id;
            public String name;
            public int sal;

            public Employee(int id, String name, int sal) {
                this.id = id;
                this.name = name;
                this.sal = sal;
            }
        }

        Predicate<Employee> p1 = e -> e.id < 10 && e.name.startsWith("A");
        Predicate<Employee> p2 = e -> e.sal < 10000;

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", 2000));
        list.add(new Employee(2, "B", 3000));
        list.add(new Employee(3, "C", 4000));
        list.add(new Employee(4, "D", 5000));

        //using allMatch
        boolean b1 = list.stream().allMatch(p1);
        System.out.println(b1);
        boolean b2 = list.stream().allMatch(p2);
        System.out.println(b2);
        //using anyMatch
        boolean b3 = list.stream().anyMatch(p1);
        System.out.println(b3);
        boolean b4 = list.stream().anyMatch(p2);
        System.out.println(b4);
        //using noneMatch
        boolean b5 = list.stream().noneMatch(p1);
        System.out.println(b5);
    }

    /**
     * Stream.filter
     * Stream.filter filters the calling stream on the basis of given predicate.
     * In the example we have an employee list and created a predicate .
     * This predicate will be passed to filter as an argument. Finally we will print the filtered stream
     */
    @Test
    public void filter() {

        class Employee {
            public int id;
            public String name;
            public int sal;

            public Employee(int id, String name, int sal) {
                this.id = id;
                this.name = name;
                this.sal = sal;
            }
        }

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", 2000));
        list.add(new Employee(2, "B", 3000));
        list.add(new Employee(3, "C", 4000));
        list.add(new Employee(4, "D", 5000));
        Predicate<Employee> filterPredicate = e -> e.id > 1 && e.sal < 6000;
        Consumer<Employee> printConsumer = e -> System.out.println(e.id + ", " + e.sal);
        list.stream().filter(filterPredicate).forEach(printConsumer);
    }


    /**
     * Stream.map
     * Stream.map transforms one stream into another stream on the basis of given function.
     * In the example we have an employee stream and then we converted into player stream using map.
     */
    @Test
    public void map() {

        class Employee {
            public int id;
            public String name;
            public int sal;

            public Employee(int id, String name, int sal) {
                this.id = id;
                this.name = name;
                this.sal = sal;
            }
        }

        class Player {
            int id;
            String name;

            Player(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", 2000));
        list.add(new Employee(2, "B", 3000));
        list.add(new Employee(3, "C", 4000));
        list.add(new Employee(4, "D", 5000));
        Stream<Player> players = list.stream().map(e -> new Player(e.id, e.name));
        players.forEach(p -> System.out.println(p.id + ", " + p.name));
    }

    /**
     * Java 8 Collection has been enriched by stream methods. These methods are stream() and parallelStream()
     * which are default methods and have been written in Collection interface.
     */
    class Employee {
        public int id;
        public String name;
        public int sal;

        public Employee(int id, String name, int sal) {
            this.id = id;
            this.name = name;
            this.sal = sal;
        }
    }

    /**
     * Parallel Stream
     * Collection.parallelStream() returns parallel stream instance for calling collection.
     * The Stream object can be used for different purpose. In this example we have taken a list of employee which has salary field.
     * For a given predicate, we will filter the list and then will calculate the average salary
     */
    @Test
    public void parallelStreamDemo() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", 2000));
        list.add(new Employee(2, "B", 3000));
        list.add(new Employee(3, "C", 4000));
        list.add(new Employee(4, "D", 5000));

        Predicate<Employee> seniorEmp = e -> e.sal > 3000 && e.sal < 6000;
        OptionalDouble averageSal = list.parallelStream().filter(seniorEmp)
                .mapToDouble(e -> e.sal).average();

        System.out.println(averageSal.getAsDouble());
    }

    /**
     * Sequential Stream
     * Collection.stream() returns a sequential stream instance for calling collection.
     * To understand Sequential stream, I am calculating the sum of salary for a given predicate
     */
    @Test
    public void sequentialStreamDemo() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "A", 2000));
        list.add(new Employee(2, "B", 3000));
        list.add(new Employee(3, "C", 4000));
        list.add(new Employee(4, "D", 5000));

        Predicate<Employee> juniorEmp = e -> e.sal > 1000 && e.sal < 4000;
        int salsum = list.stream().filter(juniorEmp)
                .mapToInt(e -> e.sal).sum();

        System.out.println(salsum);
    }

    @Test
    public void testParallelStreamExample(){
        // to get the default common pool is initialized with a parallelism
        final ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());
        // to increase the default common pool is initialized with a parallelism
        /* -Djava.util.concurrent.ForkJoinPool.common.parallelism=5 */

        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }
}
