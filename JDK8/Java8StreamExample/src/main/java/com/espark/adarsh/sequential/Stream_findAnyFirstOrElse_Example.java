package com.espark.adarsh.sequential;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_findAnyFirstOrElse_Example {


    @Test
    public void findAny_findFirst_orElse() {

        class Person {
            String personId;
            String personName;

            public Person(String personId, String personName) {
                this.personId = personId;
                this.personName = personName;
            }

            public String getPersonId() {
                return personId;
            }

            public void setPersonId(String personId) {
                this.personId = personId;
            }

            public String getPersonName() {
                return personName;
            }

            public void setPersonName(String personName) {
                this.personName = personName;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "personId='" + personId + '\'' +
                        ", personName='" + personName + '\'' +
                        '}';
            }
        }

        final List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person("100", "adarsh"));
                add(new Person("102", "amit"));
                add(new Person("103", "radha"));
            }
        };

        Person findAnyResult = personList
                .stream()                   // Convert to steam
                .filter(person -> person.getPersonName().contains("a"))    // we want name contains "a" only
                .findAny()                                    // If 'findAny' then return found
                .orElse(null);
        System.out.println("Data for Find Any "+findAnyResult);

        Person findFirstResult = personList
                .stream()                   // Convert to steam
                .filter(person -> person.getPersonName().contains("a"))    // we want name contains "a" only
                .findFirst()                                    // If 'findFirst' then return found
                .orElse(null);
        System.out.println("Data for Find First "+findFirstResult);
    }

}
