package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * java.util.Optional class has been introduced in java 8, that will avoid NullPointerException in our code.
 * We can write our code more readable and in fewer lines because now we will not apply if else condition for
 * NullPointerException. Optional class will check for null value and if null value is present then it will
 * return empty Optional instance
 */
public class OptionalExample {


    class PrimeMinister {
        String name;

        public PrimeMinister() {
        }

        public PrimeMinister(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * Optional.of()
     * of() method creates and returns the Optional instance for the given class.
     * We can apply other method of Optional class.
     * <p>
     * Optional.map()
     * map() method runs the given method in the argument if the instance is not null otherwise it returns empty
     * Optional instance. The argument which is a function cannot have Optional mapper.
     * <p>
     * Optional.orElse()
     * It returns the value in the Optional instance for the mapping method otherwise
     * it returns the value provided in orElse() argument.
     */
    @Test
    public void example1() {
        Optional<PrimeMinister> pm = Optional.of(new PrimeMinister());
        String pmName = pm.map(PrimeMinister::getName).orElse("None");
        System.out.println(pmName);
        //Assign Some Value to PrimeMinister.name
        pm = Optional.of(new PrimeMinister("Narendra Modi"));
        pmName = pm.map(PrimeMinister::getName).orElse("None");
        System.out.println(pmName);
    }


    class Country {
        Optional<PrimeMinister> primeMinister;

        public Country() {
        }

        public Country(Optional<PrimeMinister> primeMinister) {
            this.primeMinister = primeMinister;
        }

        public Optional<PrimeMinister> getPrimeMinister() {
            return primeMinister;
        }

        public void setPrimeMinister(Optional<PrimeMinister> primeMinister) {
            this.primeMinister = primeMinister;
        }
    }

    class Person {
        Optional<Country> country;

        public Person() {
        }

        public Person(Optional<Country> country) {
            this.country = country;
        }

        public Optional<Country> getCountry() {
            return country;
        }

        public void setCountry(Optional<Country> country) {
            this.country = country;
        }
    }

    /**
     * Optional.flatMap()
     * flatMap () method is same as map() method but the difference is that the method argument which is a
     * function must have Optional mapper.
     */
    @Test
    public void example2() {
        Optional<PrimeMinister> primeMinister = Optional.of(new PrimeMinister("Narendra Modi"));
        Optional<Country> country = Optional.of(new Country(primeMinister));
        Optional<Person> person = Optional.of(new Person(country));
        String pmName = person.flatMap(Person::getCountry).flatMap(Country::getPrimeMinister)
                .map(PrimeMinister::getName).orElse("None");
        System.out.println(pmName);
    }

    /**
     * Optional.filter()
     * filter() method takes Predicate instance as an argument.
     * The value in Optional instance is filtered and if filtered value is not empty then
     * value is returned otherwise empty Optional instance is returned.
     */
    @Test
    public void filter() {
        Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
        //Using Optional.filter
        Predicate<PrimeMinister> pmPredicate = p -> p.getName().length() > 15;
        System.out.println(pm.filter(pmPredicate));
    }


    /**
     * Optional.ifPresent()
     * ifPresent() method takes Consumer instance as an argument and if value is present then
     * it run the given consumer passed as an argument otherwise do nothing.
     */
    @Test
    public void ifPresent() {
        Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
        //Using Optional.ifPresent
        Consumer<PrimeMinister> pmConsumer = (PrimeMinister p) -> System.out.println(p.getName());
        pm.ifPresent(pmConsumer);
    }


    /**
     * Optional.isPresent()
     * It returns true and false value. If value is present, then returns true otherwise false
     */
    @Test
    public void isPresent() {
        Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
        //Using Optional.isPresent
        System.out.println(pm.isPresent());
    }
}
