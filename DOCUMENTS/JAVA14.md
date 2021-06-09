# JAVA 14 

### NPE Details pinpoint discription 
* add the flag to enable in compiler vmoption :->  -XX:+ShowCodeDetailsInExceptionMessages 

### Switch Cases no longer pewivew its part of langaue as official release 
```
//with yeld keyword 

        String var = "XXXx";
        String response = switch (var) {
            case "1XXXX":
                yield "1XXX";
            case "2XXXX":
                yield "2XXX";
            case "3XXXX":
                yield "3XXX";
            case "4XXXX:
                yield "4XXXX";
            default:
                yield "DEFAULT-XXXX";
        };


OR 
//  with arrow function 

        String var = "XXXx";
        String response = switch (var) {
            case "1XXXX" ->  "1XXX";
            case "2XXXX" ->  "2XXX";
            case "3XXXX" ->  "3XXX";
            case "4XXXX" ->  "4XXX";
            default:     ->  "DEFAULT-XXXX";
        };

OR 
// mixed with arrow and yeld keyword 

        String var = "XXXx";
        String response = switch (var) {
            case "1XXXX" -> {
            	System.out.println("xxxxxxxx")
                yield "1XXX";
            }
            case "2XXXX": ->{
            	System.out.println("xxxxxxxx")
                yield "2XXX";
            }
            case "3XXXX" ->  "3XXX";
            case "4XXXX" ->  "4XXX";
            default:     ->  "DEFAULT-XXXX";
        };
```

### Text block 2nd preview 
```
// for multiline string like html or xml or json data 
String text ="""
            xxxxxx
            xxxxxx
            xxxxxx
            """;


```

### Pattern Matching for instanceof operator 1st preview 

```
 // check the object is instace of String then assigne to stringObject variable for furhter operation 
 if(object instanceof String stringObject && !stringObject.isEmpty() && stringObject.equests("xxxx")){
  
       ..........
 }

or
  
  if (n instanceof Integer i){

  	  ..........

  }
```



### Record Keyword 

* records are final can't inherit further 
* records can't be abstracts becoz its final 
* record can't extends any class 
* record can implement the interface 
* getter of records are with name of properties example  field is -> name  then method is -> name()

```
// for pojo classes 
// equals()/hascode()/tostring() will be generated automatically 
// and with property name accessor method will be generated 
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

### @Serial 
* for compiletime checking for serilaliztion 


### writeBytes()
* PrintStream ->  writeBytes(bytes[] buffer)

