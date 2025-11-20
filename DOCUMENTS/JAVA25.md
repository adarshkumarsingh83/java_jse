# java 25 

### primitive 
* primittives work directly in instanceOf 
```
   int x = 10;
   if ( x instanceOf int i ){
      sout("primitve int "+i);
   }

```
* * primittives work directly in swich case 
```
   int x =10;
   stich (x){
      case 5 -> sout("value 5");
      case 10 -> sout("value 10");
      default -> sout("not matched");
   }
```
###  module inport is explictly 
```
 import java.nio.file.Path;

 Path p = Path.of("xxx");
```
* explict import of module 
```
import module java.base;

 Path p = Path.of("xxx");
```

### SOUT for printing 
* java.lang.IO
```
 print(object)
 println()    line seprateor 
 println(Object)
 readln()   single line read
 readln(String)

```

### compact source file and instace main()
```
  class AppicationMain{
      void main(){
      	IO.print("xxxxxx");
      }
  }

  or 
  void main(){
     IO.print("xxxxxx");
  }

```

### flexible construcor 
* validation computation or assignemtn before super() or this() in constructor 
```
    class CallbackService extends Callback{
 
          CallbackService(Integer input){
          	if(input!=null){
          		throw InvaludArgumentException("invalue input");
          	}
          	super(input);
          }   
    }
```

### Strcutore Concurrency 
* java threads  a group of releated task as on uint of work 
* one task fail all cancelled or all pass if no failes 

### Scoped Values 


### StableValues<T> 
* to hold immutable values 
* initilised before use and once init then no change 

###

