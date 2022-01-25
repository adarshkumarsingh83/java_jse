package com.espark.adarsh;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ApplicationMain {

    static Set<String> output = new HashSet();
    static Set<String> duplicateOutput = new HashSet();

    public static void main(String[] args) {

        int combination = 3;
        int dataArray[] = {1, 2, 1, 3, 4, 5};
        generateCombination(dataArray, dataArray.length, combination);
        System.out.println("\n");
        System.out.println("Unique combinations " + output);
        System.out.println("Duplicate combinations " + duplicateOutput);
    }

    /**
     * generateCombination()
     *
     * @param dataArray       contains actual numbers for combinations
     * @param dataArrayLength size of the dataArray
     * @param combination     actual number of combination length
     */
    static void generateCombination(int dataArray[], int dataArrayLength, int combination) {
        // combinationDataArray hold the generated combinations
        int combinationDataArray[] = new int[combination];
        combinationBuilder(dataArray, combinationDataArray, 0, dataArrayLength - 1, 0, combination);
    }

    /**
     * combinationBuilder()
     *
     * @param dataArray             contains actual numbers for combinations
     * @param combinationDataArray  hold the new combinations
     * @param startIndex            starting index of the dataArray from where recursion has to start for generation of combinations
     * @param endIndex              end index of the dataArray
     * @param combinationArrayIndex hold the index count for combinationDataArray index
     * @param combination           actual number of combination length
     */
    public static void combinationBuilder(int dataArray[],
                                          int combinationDataArray[],
                                          int startIndex,
                                          int endIndex,
                                          int combinationArrayIndex,
                                          int combination) {

        System.out.println("DataArray " + Arrays.toString(dataArray)
                + " combinationDataArray " + Arrays.toString(combinationDataArray)
                + " startIndex " + startIndex + " endIndex " + endIndex
                + " combinationArrayIndex " + combinationArrayIndex + " combination " + combination);

        if (combinationArrayIndex == combination) {
            String outputData = "";
            for (int j = 0; j < combination; j++) {
                System.out.print(combinationDataArray[j] + " ");
                outputData += combinationDataArray[j] + "";
            }
            if (!output.add(outputData)) {
                duplicateOutput.add(outputData);
            }
            System.out.println();
            return;
        }


        for (int loopIndex = startIndex; loopIndex <= endIndex && endIndex - loopIndex + 1 >= combination - combinationArrayIndex; loopIndex++) {
            combinationDataArray[combinationArrayIndex] = dataArray[loopIndex];
            System.out.println("Calling combinationUtil loopIndex=" + loopIndex
                    + " endIndex-loopIndex+1=" + (endIndex - loopIndex + 1)
                    + " combination-combinationArrayIndex=" + (combination - combinationArrayIndex));

            combinationBuilder(dataArray, combinationDataArray, loopIndex + 1, endIndex, combinationArrayIndex + 1, combination);

            System.out.println("Returning combinationUtil loopIndex=" + loopIndex
                    + " endIndex-loopIndex+1=" + (endIndex - loopIndex + 1)
                    + " combination-combinationArrayIndex=" + (combination - combinationArrayIndex));
        }
    }
}

