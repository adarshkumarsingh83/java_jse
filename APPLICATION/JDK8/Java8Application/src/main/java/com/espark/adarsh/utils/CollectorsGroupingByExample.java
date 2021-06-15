package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Adarsh on 8/19/15.
 */
public class CollectorsGroupingByExample {

    public static class Student {

        private String name;
        private int age;
        private String className;

        public Student(String name, String className, int age) {
            this.name = name;
            this.age = age;
            this.className = className;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getClassName() {
            return className;
        }
    }


    /**
     * groupingBy is a static method of java.util.stream.Collectors in java 8.
     * groupingBy does the grouping of elements on the basis of any given key and returns a Collector.
     * Find the method syntax.
     * <T,K> Collector<T,?,Map<K,List<T>>> groupingBy(Function<? super T,? extends K> classifier)
     */
    @Test
    public void groupingByExample() {
        Student s1 = new Student("Adarsh", "A", 20);
        Student s2 = new Student("Radha", "B", 22);
        Student s3 = new Student("Amit", "A", 22);
        Student s4 = new Student("Sonu", "C", 20);
        Student s5 = new Student("Monu", "B", 21);
        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
        //Group Student on the basis of ClassName
        System.out.println("----Group Student on the basis of ClassName----");
        Map<String, List<Student>> stdByClass = list.stream()
                .collect(Collectors.groupingBy(Student::getClassName));

        stdByClass.forEach((k, v) -> System.out.println("Key:" + k + "  " +
                ((List<Student>) v).stream().map(m -> m.getName()).collect(Collectors.joining(","))));

        //Group Student on the basis of age
        System.out.println("----Group Student on the basis of age----");
        Map<Integer, List<Student>> stdByAge = list.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        stdByAge.forEach((k, v) -> System.out.println("Key:" + k + "  " +
                ((List<Student>) v).stream().map(m -> m.getName()).collect(Collectors.joining(","))));
    }


    @Test
    public void testGroupByGender(){

        class Person {
            private int personId;
            private String name;
            private Gender gender;

            public Person(int personId, String name, Gender gender) {
                super();
                this.personId = personId;
                this.name = name;
                this.gender = gender;
            }

            public boolean isMale() {
                return this.gender == Gender.MALE;
            }

            public boolean isFemale() {
                return this.gender == Gender.FEMALE;
            }

            public Gender getGender() {
                return gender;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "personId=" + personId +
                        ", name='" + name + '\'' +
                        ", gender=" + gender +
                        '}';
            }
        }

        try {

            List <Person> persons = new ArrayList<Person>();
            persons.add(new Person(1, "Yashwant",  Gender.MALE));
            persons.add(new Person(2, "Mahesh", Gender.MALE));
            persons.add(new Person(3, "Vinay", Gender.MALE));
            persons.add(new Person(4, "Dinesh", Gender.MALE));
            persons.add(new Person(5, "Kapil",  Gender.MALE));
            persons.add(new Person(6, "Ganesh", Gender.MALE));
            persons.add(new Person(7, "Nita",  Gender.FEMALE));
            persons.add(new Person(8, "Pallavi", Gender.FEMALE));
            persons.add(new Person(9, "Mayuri", Gender.FEMALE));
            persons.add(new Person(10, "Divya",  Gender.FEMALE));

            Map <Gender, List<Person>> byGender = persons.stream()
                    .collect(Collectors.groupingBy(person -> person.getGender(), Collectors.toList()));

            System.out.println("Group By Gender");
            System.out.println(byGender);

            byGender.entrySet().stream().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static enum Gender {
        MALE,
        FEMALE
    }
}
