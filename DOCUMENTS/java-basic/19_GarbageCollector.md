# GC
--------------------------------
* gc is demon thread which run in the back ground and its start when jvm is started and its stop when jvm shut down 
* we can request gc for execution but we can't force the gc to executed immediately its depend the vendor algo. 
* mark and swipe is most popular algo for gc 
* Two ways to request the gc for execution 
	* System.gc
	* Runtime.gc

## if an object doesn't have any external reference then its eligible for gc even though it has internal reference it doesn't matter
Various ways to make object eligible for gc

* Nullifying object =assign null to the all reference variable of that particular object
```
   Class object=new Class();
   object=null;
```

* Reassigning the Reference Variables 
```
  Class object = new Class();
   // object is created and pointed by object variable 
   object= new Class();
   /*
    now new object is created and referenced by old reference variable and object object is no longer 
    pointing to any reference so its eligible for gc
	*/
```

* The Objects Created inside a block or methods 
	* any object is created inside the block or method the scope of those object are upto the block or method only 
     so once that block or method is executed then those object doesn't have any reference and eligible or gc 
	* in case if any reference of the object is return to the caller and that reference is stored in the caller then that isn't 
     eligible for gc but in case if the reference isn't stored then its also eligible for gc 
	* in case of assign of any reference of object created inside the block or method to static variable then also 
     it's not eligible for gc 
```
  {
    Class object= new Class();	
  }	
  
  public static void main(String ...args){
    Class object= new Class();	
  }
```  
 
* Island of Isolation
```
   public Class MyClass{
      MyClass variable;
	  
	  public static void main(String ...args){
	    
		 MyClass myClass1=new MyClass();
		 MyClass myClass2=new MyClass();
		 MyClass myClass3=new MyClass();
		 //No Object is eligible for gc 
		 
		 myClass1.variable=myClass2;
		 myClass2.variable=myClass3;
		 myClass3.variable=myClass1;
		 //No Object is eligible for gc 
		 
		 myClass1=null;
		 /*
		   No Object is eligible for gc 
		   becoz still myClass1 reference by myClass3.variable
		 */
		 myClass2=null;
		 /*
		   No Object is eligible for gc 
		   becoz still myClass2 reference by myClass3.variable.variable
		 */
	    myClass3=null;
		 /*
		  all Object is eligible for gc becoz no external reference for objects 
		  myClass1,myClass2 and myClass3 are the group of object which is isolated from external 
		  world becoz of no external reference so all are eligible for gc
		  gc can identified the object which are not having external reference and internal reference are not matter 
		  so gc can destroy 
		 */
	  }     
   } 
	
``` 
