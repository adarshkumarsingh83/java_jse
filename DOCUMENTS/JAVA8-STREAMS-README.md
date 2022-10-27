# Streams
---
* streams is applicable to collections 
* to perform set of operattion on collections 

---

* Collection: group of objects is collection 
* Streams: process object from collection then stresm is used 

### stream
* Stream is interface in java.util.stream pkg 
* stream() defualt method in Collection interface 
* collectionObject.stream() 


### filter 
* filter the element in streams 
```
collectionObject.stream()
	.filter(e -> { predicate condition })
	.collect(Collectors.toList());
```

### map 
* convert the element state 
```
collectionObject.stream()
	.map(e -> { function })
	.collect(Collectors.toList());
```

