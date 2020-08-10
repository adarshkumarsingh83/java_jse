package com.espark.adarsh;

import com.espark.adarsh.util.ApplicationUtil;
import com.espark.adarsh.util.Role;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Jdk11Service {


    //#Local-Variable Syntax for Lambda Parameters
    public void localVarInLambda(int number) {
        IntStream.range(1, number)
                .filter((var i) -> i % 2 == 0)
                .forEach(System.out::println);

        //var to be used to declare the formal parameters of an implicitly typed lambda expression.
        //(var s1, var s2) -> s1 + s2
        //(var s1, s2) -> s1 + s2 //no skipping allowed
        //(var s1, String y) -> s1 + y //no mixing allowed
        //var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.
    }

    //Reading/Writing Strings to and from the Files
    public void readFile(String data) throws Exception {
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), data);
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);
    }

    public void repeatExample(String data, int repeat) {
        String str = data.repeat(repeat);
        System.out.println(str);
    }

    public void lashNStringLines(String str) {
        // String str = "JD\nJD\nJD";
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
    }

    public void checkSwitchCaseJdk11() {
        Jdk12Service roleSwitchService = new Jdk12Service();
        Role[] roles = Role.values();
        int number = ApplicationUtil.getRandomNumberInRange(0, 4);
        Role value = roles[number];
        int repliedNumber = roleSwitchService.getRoleOrderJdk11(value);
        if (value.getValue() != repliedNumber) {
            System.out.println("Wrong Response ");
        } else {
            System.out.println("Correct Response");
        }
    }



    //Nested Based Access Control
    public void nestedBaseAccessControl() {
        MainClass mainClass = new MainClass();
        mainClass.myPrivate();
        mainClass.myPublic();

        MainClass.MainNested mainNested = mainClass.new MainNested();
        mainNested.nestedPublic();
        mainNested.nestedPrivate();
    }


    public class MainClass {

        public void myPublic() {
            System.out.println("myPublic()");
        }

        private void myPrivate() {
            System.out.println("myPrivate()");
        }

        class MainNested {

            public void nestedPublic() {
                System.out.println("nestedPublic()");
                myPrivate();
            }

            private void nestedPrivate() {
                System.out.println("nestedPrivate()");
            }
        }
    }
}
