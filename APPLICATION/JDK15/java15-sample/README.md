# java14-sample
---
* mvn clean package 
* java --enable-preview -cp .\target\java14-sample.jar com.espark.adarsh.Main 


* Sealed Classes 
```
public sealed interface MessageClazz permits GreetClazz, WishClazz {
    String getMessage();
}


public final class  GreetClazz implements MessageClazz {

    String msg;

    public GreetClazz (String msg){
        this.msg = msg;
        System.out.println("Greet:Message:Class: default constructor of Greet Class ");

    }

    @Override
    public String getMessage() {
        return "Greet:Message:Class: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Greet{" +
                "msg='" + msg + '\'' +
                '}';
    }
}

public final class WishClazz implements MessageClazz {

    String msg;

    public WishClazz(String msg) {
        this.msg = msg;
        System.out.println("Wish:Message: default constructor of Wish Class  ");
    }

    @Override
    public String getMessage() {
        return "Wish:Message:Class: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Wish{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
```

* Sealed Records
```
public sealed interface Message permits Greet, Wish{
    String getMessage();
}

public record Greet(String msg) implements Message {

    public Greet {
        System.out.println("Greet:Message: default constructor of Greet record ");
    }

    @Override
    public String getMessage() {
        return "Greet:Message: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Greet{" +
                "msg='" + msg + '\'' +
                '}';
    }
}


public record Wish(String msg) implements Message {

    public Wish {
        System.out.println("Wish:Message: default constructor of Wish record ");
    }

    @Override
    public String getMessage() {
        return "Wish:Message: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Wish{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
```

* Local records 
```
public interface Message {

    String getMessage();

}


public class MessageService {
    public String getWishMsg(String msg){
        record Wish(String msg) implements Message{
            @Override
            public String getMessage() {
                return Wish.this.msg.toUpperCase();
            }
        }
        return new Wish(msg).getMessage();
    }
}
```
