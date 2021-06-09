# java 15 

---

* Sealed classes (NEW)
* Local interfaces, classes, enums and records
* Text Blocks (standard)
* Records (second preview)
  *      local declaration, annotations, sealed records
* Pattern matching for instanceof (second preview)

* JEP 339: Edwards-Curve Digital Signature Algorithm (EdDSA)
* JEP 360: Sealed Classes (Preview)
* JEP 371: Hidden Classes
* JEP 372: Remove the Nashorn JavaScript Engine
* JEP 374: Disable and Deprecate Biased Locking
* JEP 375: Pattern Matching for instanceof (Second Preview)
* JEP 377: ZGC: A Scalable Low-Latency Garbage Collector
* JEP 378: Text Blocks
* JEP 379: Shenandoah: A Low-Pause-Time Garbage Collector
* JEP 381: Remove the Solaris and SPARC Ports
* JEP 383: Foreign-Memory Access API (Second Incubator)
* JEP 384: Records (Second Preview)
* JEP 385: Deprecate RMI Activation for Removal



### Sealed keyword  

* for classses 
```
// with sealed keyword we have restric the inhertance to limited child classes 
// we provide the permission using permit keyword to the listed class for inhertance 

public sealed class ParentSealed permits Child1, Child2{
	
  ...........
}

 public non-sealed class Child1 extends ParentSealed{
	
  ...........
}

 public final non-sealed class Child1 extends ParentSealed{
	
	.........
}

 public sealed class Child3 extends ParentSealed permit X, Y {
  
  .........
}

```
* for interfaces 
```
// with sealed keyword we have restrict the inhertance to limited child interface
// we provide the permission using permit keyword to the listed interface for extending  

public sealed interface ParentSealed permits Child1, Child2{
	
  ...........
}

 non-sealed interface Child1 extends ParentSealed{
	
  ...........
}

 non-sealed interface Child1 extends ParentSealed{
	
	.........
}

```

* for recored classes 
```
public sealed interface Animal permit Cat {

}

public record Cat (String name) implements Animal{


}

```

### Hiden Classes 

* can't be used directly by other classes 
* generated at runtime by underlying framework 
* it can be unloaded from jvm completely for avoide memeo leaking 



### Foregin Memoary Access Api 

```
by default objects are created on heap but now we can use external memoarty and access them using api 
```


### Cryptographiic Signature 


### GC 

```
Shenandoah a low pause time GC 
```


### Local interface/ local enum/ local Record 

```

    pubblic void method(){

        interface X{


        }

        enum Y{


        }

        record R(){


        }

    }


```


#### Text Block 2nd preveiw 

```
   String data ="""
                aaaaa\
                bbbbb\
                ccccc\
                """;


````


### Pattern Matching for instanceof operator 2nd preveiw 

```
 // check the object is instace of String then assigne to stringObject variable for furhter operation 
 if(object instanceof String stringObject && !stringObject.isEmpty() && stringObject.equests("xxxx")){
  
       ..........
 }

```















