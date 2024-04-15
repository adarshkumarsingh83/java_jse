# java11-sample
---
* mvn clean package 
* java --enable-preview -cp .\target\java11-sample.jar com.espark.adarsh.Main 

* isBlank() 
```
        System.out.println(" ".isBlank()); //true
        String s = "Anupam";
        System.out.println(s.isBlank()); //false
        String s1 = "";
        System.out.println(s1.isBlank()); //true
```

* lines()
```
        String str = "JD\nJD\nJD"; 
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
```
* strip(), stripLeading(), stripTrailing() 
```
        String str = " JD "; 
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");
        
        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
```

* repeat(int) 
```
        String str = "=".repeat(2);
        System.out.println(str); //prints ==
```

* Local-Variable Syntax for Lambda Parameters
```
(var s1, var s2) -> s1 + s2
(var s1, s2) -> s1 + s2 //no skipping allowed
(var s1, String y) -> s1 + y //no mixing allowed
var s1 -> s1 //not allowed. Need parentheses if you use var in lambda.
```

*  Nested Based Access Control
```
public class Main {
 
    public void myPublic() {
    }
 
    private void myPrivate() {
    }
 
    class Nested {
 
        public void nestedPublic() {
            myPrivate();
        }
    }
}

=> Java Reflection, it will give an IllegalStateException
Method method = ob.getClass().getDeclaredMethod("myPrivate");
method.invoke(ob);
```

*  Reading/Writing Strings to and from the Files
  * Files readString()
  * Files writeString()
```
Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
System.out.println(path);
String s = Files.readString(path);
System.out.println(s); //This was posted on JD
```