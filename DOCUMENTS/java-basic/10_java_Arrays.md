# Array
---
```
1.Array is indexed collection of fixed number of the homogeneous data elements
2.Space is ignored by JVM for this []
3.Only integer data is allowed for specifying size of the array (data promoted to int also allowed )
4.positive integer is the valid negative integer will not give CTE but RTE
5.At the time of array Construction base size is mandatory
6.based on the data type array elements are filled with default value.
7.for multidimensional array if other dimension are not constructed then default value will be null.
8.zero is the valid size of java Array.
9.for each loop can be used for accessing elements of the array.
10.Declaration dimension and Construction Dimension must match but size of base Dimension is mandatory otherwise CTE.
11.primitive widening of the array is not possible 
  long[] array=new int[5];
12.Reference array inheritance is allowed in java 
   ParentInterface/ParentAbstractClass/ParentClass arrayVariable[] =new ImplemetingChildClass/ChildClass[size];
```

## Declaration for One Array

### Single Dimension Array
* Ex: 
```
DataType[] variableName;
DataType []variableName;
DataType variableName[];
```

### MultiDimention Array
* Ex:1 
```
DataType[][] variableName;
DataType [][]variableName;
DataType variableName[][];
DataType []variableName[];
DataType[] variableName[];
```
* Ex:2
```
DataType[][][] variableName;
DataType[][] []variableName;
DataType[] [][]variableName;
DataType [][][]variableName;
DataType variableName[][][];
DataType []variableName[][];
DataType [][]variableName[];
DataType[] variableName[][];
DataType[] []variableName[];
```

## Declaration for Multiple Array Simultaneously

### Single Dimension Array
```
DataType[] variableName1,variableName2;
DataType []variableName1,variableName2;
DataType variableName1[],variableName2[];
```

### MultiDimention Array
* Ex:1 
```
DataType[][] variableName1,variableName2;
DataType[] variableName1[],variableName2[];
DataType [][]variableName1,variableName2;
DataType []variableName1[],variableName2[];
DataType variableName1[][],variableName2[][];
```
* Ex:2
```
DataType[][][] variableName1,variableName2;
DataType[][] []variableName1,variableName2;
DataType[] [][]variableName1,variableName2;

DataType []variableName1[][],variableName2[][];
DataType [][]variableName1[],variableName2[];
DataType [][][]variableName1,variableName2;

DataType[] []variableName1[],variableName2[];
DataType[] variableName1[][],variableName2[][];
DataType variableName1[][][],variableName2[][][];
```

## Array Construction
```
a.Always base firstDimentionSize is mandatory for array construction.
b.base firstDimentionSize must be positive integer value.
c.Zero is valid firstDimentionSize for the array.
d.base firstDimentionSize is mandatory and rest of the dimension is thirdDimentionSize.
e.before using any dimensions its mandatory to construct that dimension otherwise NPE 
f.after construction default value if the data type is assigned to the every elements of the array.
g.for unreconstructed dimensions default value will be null.
h.length is the variable which will have the size of the array.
   ex.arrayName.length;
i.value of elements inside the array can be casted but array its self can't be casted.
```
## Construction for One Array
### Single Dimension Array
```
DataType[] variableName;
  variableName=new DataType[firstDimentionSize];
DataType []variableName;
  variableName=new DataType[firstDimentionSize];
DataType variableName[];
 variableName=new DataType[firstDimentionSize];
```

### MultiDimention Array Construction

* Ex:1 
```
DataType[][] variableName;
  variableName=new DataType[firstDimentionSize][secoundDimentionSize];
DataType [][]variableName;
 variableName=new DataType[firstDimentionSize][secoundDimentionSize];
DataType variableName[][];
 variableName=new DataType[firstDimentionSize][secoundDimentionSize];
DataType []variableName[];
 variableName=new DataType[firstDimentionSize][secoundDimentionSize];
DataType[] variableName[];
 variableName=new DataType[firstDimentionSize][secoundDimentionSize];
```

* Ex:2
```
DataType[][][] variableName;
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType[][] []variableName;
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType[] [][]variableName;
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType [][][]variableName;
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType variableName[][][];
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType []variableName[][];
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType [][]variableName[];
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType[] variableName[][];
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
DataType[] []variableName[];
	variableName=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
```
	
## Declaration for Multiple Array Simultaneously

### Single Dimension Array
```
DataType[] variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize];
	variableName2=new DataType[firstDimentionSize];	
DataType []variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize];
	variableName2=new DataType[firstDimentionSize];	
DataType variableName1[],variableName2[];
	variableName1=new DataType[firstDimentionSize];
	variableName2=new DataType[firstDimentionSize];	
```

### MultiDimention Array

* Ex:1 
```
DataType[][] variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize];	
DataType[] variableName1[],variableName2[];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize];	
DataType [][]variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize];	
DataType []variableName1[],variableName2[];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize];	
DataType variableName1[][],variableName2[][];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize];	
```
* Ex:2
```
DataType[][][] variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
DataType[][] []variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
DataType[] [][]variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
	
DataType []variableName1[][],variableName2[][];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
DataType [][]variableName1[],variableName2[];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
DataType [][][]variableName1,variableName2;
	variableName1=new DataType[firstDimentionSize][secoundDimentionSizetional][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	

DataType[] []variableName1[],variableName2[];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
DataType[] variableName1[][],variableName2[][];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
DataType variableName1[][][],variableName2[][][];
	variableName1=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];
	variableName2=new DataType[firstDimentionSize][secoundDimentionSize][thirdDimentionSize];	
```
	
## Jagged Array
```
When array is consisting of multidimensional and every dimension is not the same

DataType[][] variableName;
  variableName=new DataType[3][];
  
 variableName[0]=new DataType[3]; 
 variableName[1]=new DataType[5]; 
 variableName[2]=new DataType[2]; 
``` 
 
## Single Line Array Construction and declaration

### Single Dimension

* Ex1.
```
 DataType[] variableName=new DataType[size]; 
 ```

### MultiDiamention Array

* Ex. 
```
 DataType[][] variableName= new DataType[size1][(size2|optional)];
``` 
  
## Single Line Array Declaration Construction and Initialisation

### Single Dimension
* Ex1.
```
 DataType[] variableName=new DataType[]{ val1,val2,val3,.....valn}; 
```

### MultiDiamention Array
* Ex. 
```
 DataType[][] variableName= new DataType[][]{
   ,{value1,value2,value3,.....valueN}
   ,{value1,value2,.....valueN}
   ,{value1,value2,value3,.....valueN}
   ,{value1,value2,.....valueN}   
 };
```
 
## Annonimus Array
```
 a.Array without name is known as Annonimus Array
 b.when array is required for one time use then we use Annonimus array
``` 
* Ex1.
```
  public class Test{
    
    public static void main(String ...args){
	   System.out.println(sum(new int[]{10,20,30,40,50}));
	   System.out.println(sum(new int[]{10,20,30,40,50,60,70,80}));
	}
	
	public static int sum(int ...args){
	   int sum=0;
	   for(int value:args){
	     sum+=value;
	   }
	   return sum;
	}	
  }
``` 
* Ex2.
```
public class ArrayTest {

    public static void main(String ...args){
		System.out.println(sum(new int[][]{{'a','b'},{'c','d'},{'e'}}));
        System.out.println(sum(new int[][]{{10,20},{30,40},{50}}));
        System.out.println(sum(new int[][]{{10,20,30},{40,50,60},{70,80}}));
    }

    public static int sum(int [][]args){
        int sum=0;
        for(int[] value:args){
            for(int v:value){
                sum+=v;
            }
        }
        return sum;
    }
}
```
* Ex:3
```
 public class ArrayTest {
    static int[][] a, b[];
	//a will be 2D array
	//b will be 3D array
    public static void main(String... args) {
        a = new int[3][3];
        b = new int[3][3][3];
        for (int[] array : a) {
            for (int value : array) {
                System.out.print("\t" + value);
            }
            System.out.println();
        }
        System.out.println("\t\n");
        for (int[][] array : b) {
            for (int[] interArray : array) {
                for (int value : interArray) {
                    System.out.print("\t" + value);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
	
}
```

## Array Type Casting
```
ParentClass[] parentClass=new ChildClass[validIntegerSize];
```
* Ex:
```
 Runnable[] runnableArray=new Thread[5]; //Valid 
```

 
 ChildClass[] childClassArray=new ParentClass[validIntegerSize]; //invalid in java