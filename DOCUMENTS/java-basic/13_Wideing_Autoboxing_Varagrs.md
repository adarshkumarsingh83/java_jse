
# Widening

##  Widening is the process of the promoting smaller primitive datatype to bigger primitive datatype.
```
byte---->short---->int---->long---->float---->double
         char---->|
```         
## its the oldest concept of the JDK which will always get preference
```
* Example:
    	
 public class AutoUnBoxingTest {

    public static void main(String[] args) {
        byte b=1;
        new AutoUnBoxingTest().invoke(b);
    }

    public void invoke(short s){
        System.out.println("short method invocation");
    }

    public void invoke(int i){
        System.out.println("int method invocation");
    }

    public void invoke(long l){
        System.out.println("long method invocation");
    }

    public void invoke(float f){
        System.out.println("float method invocation");
    }

    public void invoke(double d){
        System.out.println("double method invocation");
    }
}
```



# AutoBoxing

* AutoBoxing is the process of the converting primitive datatype to the corresponding Wrapper datatype.
* this is done automatically by JVM at the run time while assignment of the values.
```
                              Number Class
  |-------------|------------|------|------|--------------|---------------|
 Byte         Short        Integer      Long           Float          Double 
```

* Example:
```
 public class AutoBoxingTest {

    public static void main(String[] args) {
		byte b=1;
		new AutoUnBoxingTest().invoke(b);
        int s=1;
        new AutoUnBoxingTest().invoke(s);
		long l=1L;
		new AutoUnBoxingTest().invoke(l);
		float f=1F;
		new AutoUnBoxingTest().invoke(f);
		double d=1D;
		new AutoUnBoxingTest().invoke(d);
    }

    public void invoke(Short s){
        System.out.println("Short method invocation");
    }

    public void invoke(Integer i){
        System.out.println("Integer method invocation");
    }

    public void invoke(Long l){
        System.out.println("Long method invocation");
    }

    public void invoke(Float f){
        System.out.println("Float method invocation");
    }

    public void invoke(Double d){
        System.out.println("Double method invocation");
    }
}
```


# AutoUnBoxing

* AutoUnBoxing is the process of the converting Wrapper datatype into the primitive data type.
* this is done automatically by JVM at the run time while assignment of the values.
* Example
```    
public class AutoUnBoxingTest {

    public static void main(String[] args) {
        Byte b=1;
        new AutoUnBoxingTest().invoke(b);
        Short s =1;
        new AutoUnBoxingTest().invoke(s);
        Integer i=1;
        new AutoUnBoxingTest().invoke(i);
        Long l=-1L;
        new AutoUnBoxingTest().invoke(l);
        Float f=0F;
        new AutoUnBoxingTest().invoke(f);
        Double d=1D;
        new AutoUnBoxingTest().invoke(d);
    }

    public void invoke(short s){
        System.out.println("Short method invocation");
    }

    public void invoke(int i){
        System.out.println("Integer method invocation");
    }

    public void invoke(long l){
        System.out.println("Long method invocation");
    }

    public void invoke(float f){
        System.out.println("Float method invocation");
    }

    public void invoke(double d){
        System.out.println("Double method invocation");
    }
}
```


# Var-args

* it it meant for variable arguments its the new concept.
* it will get always least preference.
* it will internally create 1D array of the specified datatype.
* we can use for each loop for iterating on the elements of the 1D array 
* length variable can also be used to find the length of the array.

* Example:
```
public class VariableArgs {

    public static void main(String[] args) {
        System.out.println("Char With 1 args "+new VariableArgs().invoke('a'));
        System.out.println("Char With 2 args "+new VariableArgs().invoke('a','b'));
        System.out.println("Char With 3 args "+new VariableArgs().invoke('a','b','c'));
        System.out.println("Char With 4 args "+new VariableArgs().invoke('a','b','c','e'));

        System.out.println("Integer With 1 args "+new VariableArgs().invoke(1));
        System.out.println("Integer With 2 args "+new VariableArgs().invoke(1,2));
        System.out.println("Integer With 3 args "+new VariableArgs().invoke(1,2,3));
        System.out.println("Integer With 4 args "+new VariableArgs().invoke(1,2,3,4));
    }

    public int invoke(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }

    public String invoke(char... args) {
        String sum = "";
        for (char c : args) {
            sum += c;
        }
        return sum;
    }
}
```
