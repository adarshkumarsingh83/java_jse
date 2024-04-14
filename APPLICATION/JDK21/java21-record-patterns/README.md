# java21-record-patterns

---

```
 public static void recordsPattern() {
        Calculations cal1 = new Calculations(15,10,"Adarsh");
        Calculations cal2 = new Calculations(5,10,"Radha");
        String msgs = cal1.msg();
        if (cal1 instanceof Calculations(int x, int y, String msg)) {

            System.out.println(STR." sum of \{msgs}!  "+(cal1.x()+cal1.y()));
        }

         msgs = cal2.msg();
        if (cal2 instanceof Calculations(int x, int y, String msg)) {

            System.out.println(STR." sum of \{msgs}!  "+(cal2.x()+cal2.y()));
        }

        switchRecordPattern(cal1);
        switchRecordPattern(cal2);
        switchRecordPattern("adarsh kumar");
        switchRecordPattern(10);
    }

    public static void switchRecordPattern(Object o){


        switch (o) {
            case Calculations(int x, int y, String msg) 		-> System.out.printf("o is a Calculations: %d/%d%n", x, y);
            case String s               -> System.out.printf("o is a string: %s%n", s);
            default                     -> System.out.printf("o is something else: %s%n", o);
        }
    }
```