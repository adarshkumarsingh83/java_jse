package com.espark.adarsh;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ApplicationMain{

    /*
        VAR LOCAL VARIABLE TYPE INFERENCE
        ----------------------------------------------------
        1. var can be declare only for the local variable
        2. var is only for those case when declaration and construction is having same
           eg: ArrayList<Person> arrayList=new ArrayList<Person>() -> var list=new ArrayList<>()
        3. var if declared with diamond operator like below will be translated into
           eg: var list=new ArrayList<>() :-> ArrayList<Object> list = new ArrayList<Object>();
        4. if reference variable is from interface then also the var will take it as the implementation class
           eg: List<Person> arrayList=new ArrayList<Person>() :->  var list=new ArrayList<>()
              translation :-> ArrayList<Person> list=new ArrayList<Person>()
        5. var can't have null value as the initial value.
        6. multiple assignment of var can be done only for same data type.
        7. final keyword can be used for the var keyword.
        8. lambda can't be define to the var keyword.
        9. annonimus implementation can be assign to the var keyword variable.
       10. var keyword can be used in the for each loop for indexed collections
       11. var can be used for array without initialised without data type.
       12. var won't work with array initialised without data types
           eg:  int []x={1,2,3,4};   doesn't work var y={1,2,3,4,5};
       13. var doesn't work for the method parameter
           eg: public void method(var input){
               System.out.println(var);
            }
      14. var can be used in side the static and instance block

    */
    static{
        var x=10;
    }

    {
        var x=10;
    }

    public static void main(String[] args) {

        var array=new int[2];
        var array1=new int[]{1,2,3,4,5};
        int []x={1,2,3,4};
       // var y={1,2,3,4,5};

        var myName="adarsh kumar";
        var myPredicate= new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return true;
            }
        };
        var list=IntStream.range(0,10).boxed().collect(Collectors.toList());
        for(var value:list){
            System.out.println(value);
        }
    }


}
