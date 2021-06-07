# java 15 
---
### Text block 
```

String text ="""
            xxxxxx
            xxxxxx
            xxxxxx
            """;


```

* Pattern Matching for instanceof operator 
```
 // check the object is instace of String then assigne to stringObject variable for furhter operation 
 if(object instanceof String stringObject && !stringObject.isEmpty() && stringObject.equests("xxxx")){
  
       ..........
 }

```

### Record Keyword 
```
// used with construcotr for creating immutable objects 

class Sample{
	
   record Sample(String data){

   }

}


Sample  ssample=new Sample("xxxx");
// sample.data ="yyyy"; // it will failed becoz its immutable 
//to retrive the value we have to call properties like method 
System.out.println("Sample Data Value "+sample.data());

or 

// param to constructors of record 

public record Sample(String data1,String data2){

}

Sample  ssample=new Sample("xxxx","yyyyyy");
System.out.println("Sample Data 1 Value "+sample.data1());
System.out.println("Sample Data 2 Value "+sample.data2());

or 
// multiparam to constructors 
public record Sample(String data1,String data2){

     public Sample(String data1){
      this.(data1, null);
     }
}

Sample  ssample=new Sample("xxxx");
System.out.println("Sample Data  1 Value "+sample.data1());

or
// instace method to the record 

public record Sample(String data1,String data2){

     public Sample(String data1){
      this.(data1, null);
     }

     public String display(){
      return data1() +" "+data2();
     }
}

Sample  ssample=new Sample("xxxx","yyyyy");
System.out.println("Displaty "+sample.display())

or 
//satic method to the record 

public record Sample(String data1,String data2){

     public Sample(String data1){
      this.(data1, null);
     }

     public static String display(Sample sample){
      return sample.data1() +" "+sample.data2();
     }
}

Sample sample=new Sample("xxxx","yyyyy");
System.out.println("Displaty "+Sample.display(ssample))
```

### Sealed keyword  
* for classses 
```
// with sealed keyword we have restric the inhertance to limited child classes 
// we provide the permission using permit keyword to the listed class for inhertance 
public sealed class ParentSealed permits Child1, Child2{
	
  ...........
}

 final class Child1 extends ParentSealed{
	
  ...........
}

 final class Child1 extends ParentSealed{
	
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

### Foregin Memoary Access Api 
```
by default objects are created on heap but now we can use external memoarty and access them using api 
```

### Cryptographiic Signature 


### GC 
```
Shenandoah a low pause time GC 
```

















