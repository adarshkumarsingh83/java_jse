package com.espark.adarsh;

import com.espark.adarsh.util.ApplicationUtil;
import com.espark.adarsh.util.Role;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Jdk12Service {

    // Switch-Statement with break
    public int getRoleOrderJdk11(Role role) {
        int rolePriority = -1;
        switch (role) {
            case ADMIN:
                rolePriority = 1;
                break;
            case USER:
            case GROUP:
                rolePriority = 2;
                break;
            case VISITOR:
                rolePriority = 3;
                break;
            case ANNONIMUS:
                rolePriority = 4;
                break;
            default:
                throw new RuntimeException("invalid role");
        }
        ;
        return rolePriority;
    }

    public int getRoleOrderJdk12(Role role) {
        int rolePriority = switch (role) {
            case ADMIN -> 1;
            case USER, GROUP -> 2;
            case VISITOR -> 3;
            case ANNONIMUS -> 4;
            default -> throw new RuntimeException("invalid role");
        };
        return rolePriority;
    }


    public void streamOperation12() {

        System.out.println(Stream.of(1, 4, 2, 7, 4, 6, 5)
                .collect(Collectors.summingDouble(i -> i)));

        System.out.println(Stream.of(1, 4, 2, 7, 4, 6, 5)
                .collect(Collectors.counting()));
        ;

        double average = Stream.of(1, 4, 2, 7, 4, 6, 5)
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(i -> i),
                                Collectors.counting(),
                                (sum, n) -> sum / n)
                );
        System.out.println(average);
    }


    public void checkSwitchCaseJdk12() {
        Jdk12Service roleSwitchService = new Jdk12Service();
        Role[] roles = Role.values();
        int number =  ApplicationUtil.getRandomNumberInRange(0, 4);
        Role value = roles[number];
        int repliedNumber = roleSwitchService.getRoleOrderJdk12(value);
        if (value.getValue() != repliedNumber) {
            System.out.println("Wrong Response ");
        } else {
            System.out.println("Correct Response");
        }
    }


}
