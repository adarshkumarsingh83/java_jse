
### Functional inteface 

* functional inteface can refer lambda express 
	* FuncationalIntefaceName variable = (variabls) -> {.....};
		* variable.functionalInfaceMethod();
* function interface can refer the method reference 
	* staic mehod refrence 
		* FuncationalIntefaceName variable = className::methodName;
	  		* variable.functionalInfaceMethod();
	* instacde mehod reference 
		* FuncationalIntefaceName variable = classObject::methodName;
	  		* variable.functionalInfaceMethod();

## scope resolution 
* method refrence 
	* static method refernce 
	* instace method refrence 
* constructor refrence 

### NOTE only args must match for refrence 

---

## mthod reference 
* code reusablity is advantage of this approach 
* same args must be their for refrence method (args type and args order must be same)
* return type can be diffrent 
* modifer can be diffeernt 
* name can be diffrent 

```
when rather then providing implementation for the functional interface abstract method we use any other method as the implemenation 
and refrence it by using scope resoluction operator then when ever the functional interface mthod is invoke the attached refrence 
method will be invoke internally ino our case whave 
Service interface which has doService() for which we have ussed serviceOperation()  as the implemenation so when ever 
service.doService() will be invoked it will invoke serviceOperation() internally becuase 
for doService() method implemenation we have reference for the serviceOperation() method using scope resolution 

```
### static method refrence example 
```
interface Service{

	 void doService();
}

class App{

	psv main(String ...args){
		Service service = () -> { sout("lambda implementation"); }
		service.doService(); // this will invoke the labda implemenation 
	}
}

class App{

	public static void serviceOperation(){
		sout("method reference");
	}

	psv main(String ...args){
		Service service = App::serviceOperation;
		service.doService(); // it will invoke the method refrence serviceOperation()
	}
}
```
### instance method refrence example 
```
interface Service{

	 void doService();
}

class App{

	psv main(String ...args){
		Service service = () -> { sout("lambda implementation"); }
		service.doService(); // this will invoke the labda implemenation 
	}
}

class App{

	public void serviceOperation(){
		sout("method reference");
	}

	psv main(String ...args){
		App app = new App();
		Service service = app::serviceOperation; 
		service.doService(); // it will invoke the method refrence serviceOperation()
	}
}
```

### constructor reference 

```
when ever the function inteface getTool method will be invoke then 
due to constructor refreence of the Tool class construcot will be invoke and get the new object of Tool class

class Tool{
	Tool(){
		sout("tool construcotr");
	}
	void performJob(){
		sout("doing job");
	}
}

inteface Job{
	Tool getTool();
}

// with lambda 
class App{
	psvmain(String args[]){
		Job job = () -> new Tool();
		Tool tool = job.getTool();
        tool.performJob();
	}
}

// with constructor refrence 
class App{
	psvmain(String args[]){
		Job job = () -> Tool:: new;
		Tool tool = job.getTool();
        tool.performJob();
	}
}
```

