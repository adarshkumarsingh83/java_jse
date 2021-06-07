# java 15 
---


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

















