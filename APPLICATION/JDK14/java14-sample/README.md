# java14-sample
---
* mvn clean package 
* java --enable-preview -cp .\target\java14-sample.jar com.espark.adarsh.Main 


* Switch Expressions
```
 String result = switch (day) {
            case "M", "W", "F" -> "MWF";
            case "T", "TH", "S" -> "TTS";
            default -> {
                if(day.isEmpty())
                    yield "Please insert a valid day.";
                else
                    yield "Looks like a Sunday.";
            }

        };
        System.out.println(result);
```

* Pattern Matching for instanceof 
```
   if (obj instanceof Greet greet) {
            System.out.println(greet.msg());
        }else{
            System.out.println("not a instance of Greet");
        }
```

*  NullPointerExceptions Details Message 
```
 public void nullPointerExceptionJdk14(Greet greet){
        System.out.println(greet.getMessage());
    }
```

* Record is feature 
```
public record Greet(String msg) implements Serializable {

    public Greet {
        System.out.println("default constructor of Greet record ");
    }

    public String getMessage() {
        return msg.toUpperCase();
    }
}
```