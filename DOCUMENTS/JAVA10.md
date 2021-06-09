# JAVA 10 

---


### var keyword 

* var x= 10;
* assignement of null value is not possible expect type value is expected 
* based on the value assiged type is defined 
* reassignment of the differnt type is not possible 
* var as return type of method is not possible 
* var as method param is not possible 
* var as a identifier not possible 
* can be used in loop 
  ```
    for (var x : list){
    	System.out.println(x);
    }
  ``` 
* var can't be used like this var x ={};
* var can't be used like this var x = {1,2,3};  
* var can be used liek var x = new int[]{1,2,3,4,5}

### Var with Try with Resources 

```
  public static void main(String ...args){

      try(var r1 = new MyResource();
          var r2 = new MyResource()){
         
         ......................

      }catch(Exception e){
         System.out.println(":()");
      }finally{
         System.out.println(":(");
      }
  }
 
 class MyResource implement AutoCloseable{
 	 public void close()throrws Exception{
 	 	 System.out.println("clse");
 	 }
 }


 // In java 9 now we can diclar like this 
 //exception will not be handle by catch block now 
   public static void main(String ...args){
   	var r1 = new MyResource();
    var r1 = new MyResource()

      try(r1;r2){
         
         ......................

      }catch(Exception e){
         System.out.println(":()");
      }finally{
         System.out.println(":(");
      }
  }
 
 class MyResource implement AutoCloseable{
 	 public void close()throrws Exception{
 	 	 System.out.println("clse");
 	 }
 }

```
----
