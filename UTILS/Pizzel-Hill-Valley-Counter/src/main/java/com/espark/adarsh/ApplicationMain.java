package com.espark.adarsh;

import com.espark.adarsh.service.HIllValleyCounter;
import com.sun.javaws.exceptions.InvalidArgumentException;

public class ApplicationMain {
    public static void main(String[] args) throws InvalidArgumentException {
        HIllValleyCounter hIllValleyCounter = new HIllValleyCounter();
        String inputSteps[][] = {{"U", "U", "U", "D", "D", "D"},
                {"D", "D", "D", "U", "U", "U"},
                {"U", "D", "D", "D", "U", "U"},
                {"U", "D", "D", "D", "U", "D", "U", "U"},
                {"U", "D", "D", "D", "U", "D", "U", "U", "D", "U"},
                {"D", "U", "Z"}};
        for (String[] input : inputSteps) {
            for (String step : input) {
                hIllValleyCounter.calculate(step);
            }
            hIllValleyCounter.showDetails();
        }
    }
}
