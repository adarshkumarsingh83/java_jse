## Lambda
* annonimus function 
* without name and not with modifiers
* no return type  
* body of lambda contain one stmt then curly braces are optionals 
* if lambda is taking multiple args with same type then data type of args type is not mandatory (when compiler is able to guss the data type)
* for one line lambda body with return value the return keyword is not required 
* for one args for the lambda paranthisis is not mandatory for method args 
* for multiple line body curly braces is mandatory 
* for multiple line body and lambda has to return value then return keyword is mandatory 

---

## Functional Interface 
* To invoke he lambda f() we have to use funtional interface 
* interface with single abstract method 
* any number of default method is allowed 
* any number of static method is allowd  
* functional interface is the type for the lambda expression 
* To invoke lambda functional interface is requried 
* if abstract method is flowing from parent as part of inheritance and child doesn't containes any abstact method its fucntional interface 
* if abstract method is flowing from parent as part of inheritance and child also containes same abstact method its method overriding and child is fucntional interface 
* parent and child can't contains the abstract method then child is not fucntional interface 
* if parent is functional interface and child is non fucntional interface then both can contains two different abstract method
* if interface contains more then one abstract method compliler is not able to map the type of the lambda with the abstract method.
---

## @FunctionalInterface 
* To let complier know that is functional interface 
* in case of violdation of functional interface rule raise the errors 
* minimum and max one abstract method is requred 

## Invoking Lambda 

### without the method param 

* without lambda expression 
```
Interface Service{
    public void doService();
}

Class ServiceDriver{

	public static void main(String ...args){
		Service service = new Service(){
			public void doService(){
				........
			}
		};

		service.doService();
	}
}
```
* with lambda expression 
```
Interface Service{
    public void doService();
}

Class ServiceDriver{

	public static void main(String ...args){
		Service service = () -> {
				........
			} ;

		service.doService();
	}
}
```

### with the method param 

* without lambda expression 
```
Interface Service{
    public void doService(DatayType var);
}

Class ServiceDriver{

	public static void main(String ...args){
		Service service = new Service(){
			public void doService(DatayType var){
				........
			}
		};

		service.doService(inputVar);
	}
}
```
* with lambda expression 
```
Interface Service{
    public void doService();
}

Class ServiceDriver{

	public static void main(String ...args){
		Service service = (var) -> {
				........
			} ;

		service.doService(inputVar);
	}
}
```

### with the method param and with return type

* without lambda expression 
```
Interface Service{
    public ReturnDataType doService(DatayType var);
}

Class ServiceDriver{

	public static void main(String ...args){
		Service service = new Service(){
			public ReturnDataType doService(DatayType var){
				........
			}
		};

		ReturnDataType result = service.doService(inputVar);
	}
}
```
* with lambda expression 
```
Interface Service{
    public void doService();
}

Class ServiceDriver{

	public static void main(String ...args){
		Service service = (var) -> {
				........
				return returnValue;
			} ;

		ReturnDataType result = service.doService(inputVar);
	}
}
```

---

## lambda with collection 
* ArrayList Sorting 
```
ArrayList<Integer> list = new ArrayList<Integer>(){
	{
		add(10);
		add(0);
		add(40);
		add(8);
		add(99);
		add(10);
	}
};
sout(list);
Collections.sort(list,(e1,e2) -> (e1>e2) ? 1 : (e1<e2) : -1 : 0);
sout(list);
```

* Set Sorting 
```
TreeSet<Integer> set = new TreeSet<Integer>((e1,e2) -> (e1>e2) ? -1 : (e1<e2) : 1 : 0){
	{
		add(10);
		add(0);
		add(40);
		add(8);
		add(99);
		add(10);
	}
};
sout(set);
```

* Map Sorting 
```
TreeMap<Integer,String> map = new TreeMap<Integer,String>((e1,e2) -> (e1>e2) ? -1 : (e1<e2) : 1 : 0){
	{
       put(3,"aaa");
       put(2,"zaa");
       put(5,"daa");
       put(1,"gaa");
       put(0,"ba");
	}
};
sout(map);

```
* Custom Object Sorting 
```
class Employee{
	Integer empId;
	String name;
	public Emploiyee(Inteer empId,String name){
		......
	}
	public String toString(){
		.......
	}
}

ArrayList<Employee> list = new ArrayList<Employee>(){
	{
		add(new Employee(10,"aaa");
		add(new Employee(0,"aaa");
		add(new Employee(40,"aaa");
		add(new Employee(8,"aaa");
		add(new Employee(99,"aaa");
		add(new Employee(10,"aaa");
	}
};
sout(list);
Collections.sort(list,(e1,e2) -> (e1.empId > e2.empId) ? 1 : (e1.empId < e2.empId) : -1 : 0);
sout(list);
Collections.sort(list,(e1,e2) -> (e1.name.length() > e2.name.length()) ? 1 : (e1.name.length() < e2.name.length()) : -1 : 0);
sout(list);
```

---

## Annonimus Class v/s Lambda 

* annonimus class can implement inteface 
* annonimus class can extends abstract class 
* annonimus class can extends concreat class 
* only annonimus class which has only one mehod from interface can be replaced with lambda 
* annonimus class which has mulitple method either by inheriatance or by its self can't be replce with lambda 

* Annonimus class 
```
new Thread(
       new Runnable(){
       	   public void run(){
       	   	   .......do somethings......
       	   }
       }
	).start();
```

* Lambda
```
new Thread(()->{.......do somethings......}).start()
```

### Variable in Annoymus Inner Class v/s Lamda 

* Annoymus Inner
* this k/w always refers to innerclass instance
* all var in annonimnus inner class is class leval var
```
interface Service{
	void doService();
}

class ServiceProvider{

   int type=10;
  void performServide(){
     Service s = new Service(){
     	int type = 20;
     	void doService(){
     		sout(this.type); // 20
     		sout(ServiceProvider.this.type); //10
     	}
     };
     s.doService();
  }

  psv main(String ...args){
      new ServiceProvider().performServide();
  }
}
```

* Lambda 
* this k/w always refers to outerclass instance 
* all var in lambda is local variable 
```
interface Service{
	void doService();
}

class ServiceProvider{

   int type=10;
  void performServide(){
     Service s = () -> {
     	    int type = 20;  
     	    sout(type); //20
     		sout(this.type);  // 10

     	};

     s.doService();
  }

  psv main(String ...args){
      new ServiceProvider().performServide();
  }
}
```

## dfference 
### Annonimus inner class 
* class without name
* it can extends and implements class and inteface with any number of methods in it 
* it can be instanciated 
* this k/w refers to out class instance 
* best for mulit method interface or class
* seprate .class file will be generated at the time of compilation 
* on demand memo. allocation where ever object is created 

### lambd
* method without name
* it can't extends and implements class and inteface 
* it can be instanciated
* it can't be instanciated
* best for single method interface 
* this k/w refers to current class instance 
* no seprate .class file will be generated at the time of compilation 
* reside in permanent memoary which is method area 