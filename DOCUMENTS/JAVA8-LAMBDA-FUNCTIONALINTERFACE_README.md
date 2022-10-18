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






