# java11-sample
---
* mvn clean package 
* java --enable-preview -cp .\target\java11-sample.jar com.espark.adarsh.Main 





* . Switch Expressions (Preview)
```
  String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> (day.isEmpty()) ? "invalid input " :  "Looks like a Sunday." ;
        };
```

* File.mismatch()
```
        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3,"adarsh Test String");
        Files.writeString(filePath4,"adarsh.com Test String");

        long mismatch2 = Files.mismatch(filePath3, filePath4);

        System.out.println("Mismatch position in file3 and file4 is >>>>");
        System.out.println(mismatch2);
```

* CompactNumberFormatting 
```
 System.out.println("Compact Formatting is:");
        NumberFormat upvotes = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        upvotes.setMaximumFractionDigits(1);

        System.out.println(upvotes.format(2592) + " upvotes");


        NumberFormat upvotes2 = NumberFormat
                .getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.LONG);
        upvotes2.setMaximumFractionDigits(2);
        System.out.println(upvotes2.format(2011) + " upvotes");
```

* Teeing Collectors
```
 double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        summingDouble(i -> i),
                        counting(),
                        (sum, n) -> {
                            System.out.println("sum "+sum+" counting "+n);
                            return sum / n ;
                        }));

        System.out.println(mean);
```


* Java Strings New Methods
    * indent(int n)
    ```
    String s = "I am\na multiline\nString.";
    System.out.println(s);
    System.out.println(s.indent(4));
    ```
    * transform(Function f)
    ```
    String uppercase = "abcde".transform(String::toUpperCase);
    Integer i        = "12345".transform(Integer::valueOf);
    BigDecimal big   = "1234567891011121314151617181920".transform(BigDecimal::new);
    ```
    * Optional describeConstable()
    * String resolveConstantDesc​(MethodHandles.Lookup lookup)
