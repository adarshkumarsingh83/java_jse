## Default method 
--- 

* defual method is diclared witth default k/w in inteface 
* default method can be overridden in the implementing class 
* object class method can't overide as deffault mehod in interface but in abstract class it possible 
* syntax 
```
  interface Service{
      default void doService(){
      	.......implementation.......
      }
  }

  class SevieTest{
  	psv main(String ...args){
       Service s = new Service(){
       };
       s.doService();

       // overriding default method 
       Service s1 = new Service(){
       	public void doService(){
      	   .......implementation.......
         }
       };
       s1.doService();
  	}
  }
```

## Default method from mulitple inheritance from interface 
* when two intefae contains the same method with same signarue and implemented into the class 
* we have to override the default method and call the specific inteface default method InterfaceName.super.methodName();
```
interface Service1{
	default void doService(){
		.......implementation.......
	}
}

interface Service2{
	default void doService(){
		.......implementation.......
	}
}

class ServiceProvider implements Service1 ,Serviice2{

    void doService(){
	   Service1.super.doService();
       Service2.super.doService();
	}
}
```