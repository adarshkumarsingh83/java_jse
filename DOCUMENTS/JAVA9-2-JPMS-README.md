## JAVA9 NEW FEATURES (21 sept 2017 )

---

## jpms(java plateform module system)
* JEP for modular programming development started in 2005  
* into in jdk 1.9 in 2017 
* jigsaw project is based for jpms 


### Module based developmet 
* till jdk 1.8 programming style 
  * packages contains classes interface & enums 
  * jar file contains packages 
  * interface class enum -> pakcage -> jar file -> classpath -> run the application 
* from jdk 1.9 onwards programing style 
  * module is group of packages 
  * module contains configuration informaiton in form of module-info.java 
  * if module-info.java is not avaliabe in module then jvm will not consider that moudle as module 
