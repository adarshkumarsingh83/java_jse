### Simple without any changes just compile and run it with class path 
> compile class create a jar file and add it in module path and run it 
> this is the example of automatic module where the old jars are running 
> in the module path 



```
java9-cmd-modules-ex2 
|
├── ./README.md
├── ./first
│   └── ./first/com
│       └── ./first/com/espark
│           └── ./first/com/espark/adarsh
│               └── ./first/com/espark/adarsh/first
│                   └── ./first/com/espark/adarsh/first/First.java
├── ./java9-cmd-modules-ex3.iml
├── ./main
│   └── ./main/com
│       └── ./main/com/espark
│           └── ./main/com/espark/adarsh
│               └── ./main/com/espark/adarsh/main
│                   └── ./main/com/espark/adarsh/main/ApplicationMain.java
├── ./output
│   └── ./output/mlib
│       ├── ./output/mlib/first.jar
│       ├── ./output/mlib/main.jar
│       └── ./output/mlib/second.jar
├── ./run.sh
└── ./second
    └── ./second/com
        └── ./second/com/espark
            └── ./second/com/espark/adarsh
                └── ./second/com/espark/adarsh/second
                    └── ./second/com/espark/adarsh/second/Second.java

```

### To Compile and run 
* $ sh run.sh 



### how to find the module name 
* jar -f output/mlib/xxx.jar -d 
* $ jar -f output/mlib/first.jar -d
* $ jar -f output/mlib/second.jar -d 
* $ jar -f output/mlib/main.jar -d
    
    
### To View jar content 
* $ jar -tf output/mlib/xxx.jar 
* $ jar -tf output/mlib/main.jar 
* $ jar -tf output/mlib/first.jar 
* $ jar -tf output/mlib/second.jar 
