package com.espark.adarsh.service;

import com.sun.javaws.exceptions.InvalidArgumentException;
import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class HIllValleyCounter {

    private Stack<String> statusFinder = new Stack<>();
    private int valleyCounter = 0;
    private int hillCounter = 0;

    public void calculate(String input) throws InvalidArgumentException {
        if (input.matches("[U|D]*")) {
            if (statusFinder.isEmpty()) {
                statusFinder.push(input);
            } else {
                if (statusFinder.peek().equals(input)) {
                    statusFinder.push(input);
                } else {
                    String topVal = statusFinder.pop();
                    if (input.equals("U") && topVal.equals("D")) {
                        if (statusFinder.isEmpty()) {
                            valleyCounter++;
                        }
                    } else if (input.equals("D") && topVal.equals("U")) {
                        if (statusFinder.isEmpty()) {
                            hillCounter++;
                        }
                    }
                }
            }
        } else {
            throw new InvalidArgumentException(new String[]{"INVALID ARGUMENT FOR STEP"});
        }
    }

    public void showDetails() {
        System.out.println("Total Valley " + valleyCounter);
        System.out.println("Total Hill " + hillCounter);
        System.out.println();
        statusFinder.clear();
        valleyCounter = 0;
        hillCounter = 0;
    }
}
