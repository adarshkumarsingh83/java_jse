package com.espark.adarsh;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

public class Jdk12Service {


    public void streamOperation12() {

        System.out.println(Stream.of(1, 4, 2, 7, 4, 6, 5)
                .collect(summingDouble(i -> i)));

        System.out.println(Stream.of(1, 4, 2, 7, 4, 6, 5)
                .collect(counting()));
        ;

        double average = Stream.of(1, 4, 2, 7, 4, 6, 5)
                .collect(
                        Collectors.teeing(
                                summingDouble(i -> i),
                                counting(),
                                (sum, n) -> sum / n)
                );
        System.out.println(average);
    }


    public void checkSwitchCaseJdk12(String day) {
        String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> (day.isEmpty()) ? "invalid input " :  "Looks like a Sunday." ;
        };
        System.out.println(result);
    }

    public void fileMismatchedJdk12() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1,"adarsh Test String");
        Files.writeString(filePath2,"adarsh Test String");

        long mismatch = Files.mismatch(filePath1, filePath2);

        System.out.println("File Mismatch position... It returns -1 if there is no mismatch");

        System.out.println("Mismatch position in file1 and file2 is >>>>");
        System.out.println(mismatch);

        filePath1.toFile().deleteOnExit();
        filePath2.toFile().deleteOnExit();

        System.out.println();

        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3,"adarsh Test String");
        Files.writeString(filePath4,"adarsh.com Test String");

        long mismatch2 = Files.mismatch(filePath3, filePath4);

        System.out.println("Mismatch position in file3 and file4 is >>>>");
        System.out.println(mismatch2);

        filePath3.toFile().deleteOnExit();
        filePath4.toFile().deleteOnExit();
    }

    public void compactNumberFormatting(){
        System.out.println("Compact Formatting is:");
        NumberFormat upvotes = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        upvotes.setMaximumFractionDigits(1);

        System.out.println(upvotes.format(2592) + " upvotes");


        NumberFormat upvotes2 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        upvotes2.setMaximumFractionDigits(2);
        System.out.println(upvotes2.format(2011) + " upvotes");
    }

    public void teeingCollector(){
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        summingDouble(i -> i),
                        counting(),
                        (sum, n) -> {
                            System.out.println("sum "+sum+" counting "+n);
                            return sum / n ;
                        }));

        System.out.println(mean);
    }
}
