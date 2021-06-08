# java9-module-example1 

--- 

* persistence module 
```
  it will have data storing capablities 
this will export the respostiry and entites to outside 
```

* services modules 
```
it will import the persitance modules and provide logic and 
send to the consumer modules 
this will import the persitance module 
```

* aggregator module 
```
this will be a placeholder module which will aggregate the imports 
from differnt modules and bundle it and send it to the consumer module 
```