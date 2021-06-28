# Java Variable
---

## Rules for Variable Declaration
```
a.can Start with a-z|A-Z|0-9|$| _ 
b.can't start with 0-9
c.any predefine class name ,interface name ,enums  or Event name can be used as the variable 
d.java keyword can't be use as the variable.
e.camel case is the variable case convention and Capital case for constant 
f.$ symbol can be suffix for currency variable
g._ is for system variable which is used internally.
```

* Variable:= 
```
is the named storage container in the program which is manipulated during the program execution.
           its bind with specific data type and its size depend on that defined data type.
```

* Identifier:=
```
Name assign to any class , Interface ,Variable ,package ,methods ,enums 
```

* Literals:=
```
constant value assign to the variable is know as literals
NOTE:=> Underscore can be used in between the literals irrespective of binary,decimal,octal and hexadecimal literal
```
 * Types of Literals
  * Integer literal(binary,decimal,octal,hexadecimal)
  * Floating Literal
  * Char Literal
  * String Literal
  * Boolean Literal	  	   	   	  

```
	   a.Integer Literals 
	     0.Binary literal 
		   a.base 2 value [0-1]
		   b.prefix with small b or capital B [b]|[B]
	     1.Decimal literals 
		   a.base 10 value [0-9] 
		   b.no prefix and no suffix		   
		 2.Octal literals 
		   a.base 8 value [0-7]
		   b.prefix with small o or capital O [o]|[O]
		 3.Hexadecimal literals
		   a.base 16 value [0-9][a-f][A-F]
		   b.prefix with zero and alphabet x small or capital [0x]|[0X]
	   
	   b.Long Literals 
	     0.Binary literal 
		   a.base 2 value [0-1]
		   b.prefix with small b or capital B [b]|[B]
	     1.Decimal literals 
		   a.base 10 value [0-9] 
		   b.no prefix and no suffix		   

		 2.Octal literals 
		   a.base 8 value [0-7]
		   b.prefix with small o or capital O [o]|[O]

		 3.Hexadecimal literals
		   a.base 16 value [0-9][a-f][A-F]
		   b.prefix with zero and alphabet x small or capital [0x]|[0X]
		   
	   c.Byte Literals & Short Literals 
	      byte:=if int value with in the range of -128 to +127 is applicable for byte literals	               		  	   
		  short:=if int value with in the range of -32,768 to 32,767 is applicable for short literals
		  
	   e.Floating-point Literals
	     1.Float literals
		   a.base 10 value [0-9] with the floating point precession and after decimal value.
		   b.suffix with small f or capital F after the literal value ex 10.00f ,10.00F

		 2.Double literals
		  a.base 10 value [0-9] with the floating point precession value after decimal 
		  b.suffix with small d or capital D after the literal value ex 10.00d ,10.00D
		  c.by default every floating literal is double type.
		  
	   f.Boolean Literals
	      a.boolean is having reserve literal true or false 
		  b.by default its false
		  
	   g.Charter Literals
	      a.Any value with in single quotes is charter literals ex char c='x'
		  b.Unicode values 0 to 65535 ex char c=65535;
		  c.Decimal literal base 10 value [0-9] without single quotes ex char c=10;
		  d.Octal Literal base 8 value [0-7] prefix with zero 0 without single quotes ex char c=011;
		  d.Hexadecimal literal base 16 value [0-9][a-f][A-F] prefix with zero 0 and alphabet small or capital x [0x][0X] without single quotes ex char c=0xbeaf char c=0Xface
		  e.Four Digit hexadecimal prefix with \u with in single quotes ex  char c='\uFACE'; char c='\uface'
		  
	   h.String Literals
	      sequence of the character set with in double quotes is string literals ex String st="radha";
```

		  

## Variable Types

### Primitive Variable
```
 Variable which are declared and bonded with the primitive data type is primitive variable.
```
* Primitive Class Variable
```
   a.variable which is declared directly inside the class and out side of any blocks with the static keyword with primitive datatype
   b.class variable is shared among all the instances of the class 
   c.Jvm will automatically initialised the value with the default value according to the data type if literal is not assign to it.
   d.scope of the variable is class level.
   e.keywords for class level variable 
     public,private,protected,final,volatile,transient
   f.static variable are stored in permanent generation(permgen) area of heap which is for class loader and this variable is reference by class name. 
``` 
* Primitive Instance Variable
```
   a.variable which is declared directly inside the class and outside of any block with primitive datatype
   b.every instance is having separate copy of the variable associated to the instance of the class
   c.Jvm will automatically initialised the value with the default value according to the data type if literal is not assign to it.
   d.scope of the variable is object level.
   e.keywords for instance level variable 
     public,private,protected,final,volatile,transient
   f.all objects are stored in young generation area of the heap and this type of variable will be referenced by object 
``` 
 * Primitive Local Variable

```
  a.variable which is declared within some block or method or loop or if or switch with primitive datatype is know as local variable
  b.its scope is with in the block and it is created on stack
  c.this variable is only alive until block execution 
  d.Jvm will not  initialised the default value we need to explicitly initialised value before use otherwise we age var might not initialised
  e.keywords for class level variable 
     final
  f.all the local variable are stored in stack	 
```

### Reference Variable
```
 Variable which are declared and bonded with the predefine or custom Class type or Interface type variable is Reference variable 
``` 
* Reference Class Variable
```
   a.variable which is declared directly inside the class and out side of any blocks with the static keyword with predefine or custom Class or Interface type
   b.class variable is shared among all the instances of the class 
   c.Jvm will automatically initialised the value with the default value according to the data type if literal is not assign to it.
   d.scope of the variable is class level.
   e.keywords for class level variable 
     public,private,protected,final,volatile,transient
  f.static variable are stored in permanent generation(permgen) area of heap which is for class loader and this variable is reference by class name 
``` 
 * Reference Instance Variable
```
   a.variable which is declared directly inside the class and outside of any block with predefine or custom Class or Interface type
   b.every instance is having separate copy of the variable associated to the instance of the class
   c.Jvm will automatically initialised the value with the default value according to the data type if literal is not assign to it.
   d.scope of the variable is object level.
   e.keywords for instance level variable 
     public,private,protected,final,volatile,transient
  f.all objects are stored in young generation area of the heap and this type of variable will be referenced by object 
``` 
 * Reference Local Variable
```
  a.variable which is declared within some block or method or loop or if or switch with predefine or custom Class or Interface type is know as local variable
  b.its scope is with in the block and it is created on stack
  c.this variable is only alive until block execution 
  d.Jvm will not  initialised the default value we need to explicitly initialised value before use otherwise we age var might not initialised
  e.keywords for class level variable 
     final
  f.all the local variable are stored in stack 
```  
---

### Examples 
```

    /* -128 to 127 for byte   */
    // Byte Literal
    byte byteBinaryMaxValue=0b01111111;  // binary
    byte byteDecimalMaxValue=127;     // decimal
    byte byteDecimalMinValue=-128;
    byte byteOctalMaxValue= 0177;  // Octal St with 0 and (0-7)
   // byte b5= 0200;  // Octal St with 0 and (0-7)
    byte byteHexaMaxValue = 0x7F;
    byte b7=0X7f;

    // Short Literal
    /* -32768 to +32767 */
    short shortBinaryMaxValue =0b0111111111111111 ;
    short s2 =0b000000000000000 ;
    short shortDecimalMaxValue =32767 ;
    short shortDecimalMinValue =-32768 ;
    short shortOctalMaxValue =077777 ;
    short shortHexaDecimalMaxValue = 0x7FFF;
    short s7 = 0X7FFF;

    // Int Literal
    /* -2147483648 to 2147483647*/
    int intBinaryMaxValue = 0b1111111111111111111111111111111;
    int i2 = 0B1111111111111111111111111111111;
    int intDecimalMaxValue = 2147483647;
    int intDecimalMinValue = -2147483648;
    int intOctalMaxValue = 017777777777;
    int intHexaDecimalMaxValue = 0x7FFFFFFF;
    int i7 = 0X7FFFFFFF;

    // long literal
    /* -9,223,372,036,854,775,808 TO 9,223,372,036,854,775,807  */
    long longBinaryMaxValue= 0b111111111111111111111111111111111111111111111111111111111111111L;
    long l2= 0B1000000000000000000000000000000000000000000000000000000000000000L;
    long longDecimalMaxValue= 9223372036854775807L;
    long longDecimalMinValue= -9223372036854775808l;
    long longOctalMaxValue= 0777777777777777777777L;
    long l6= 01000000000000000000000L;
    long longHexaDecimalMaxValue= 0x8000000000000000L;
    long l8= 0X7fffffffffffffffL;

    //float Literal
    float floatMaxValue= 3.4028235E38F;
    float floatMinValue=1.4E-45f;
	equivalent value of 3.4028235E38 in binary ,octal and in 
	hexadecimal and suffix with small f or capital F is applicable

    //double Literal
    double doubleMaxValue=1.7976931348623157E308d;
    double doubleMinValue=4.9E-324D;
	equivalent value of 1.7976931348623157E308 in binary ,octal and in 
	hexadecimal and suffix with small d or capital D is applicable

    //character Literal
    char charVar = 'a';
    char charDecimalMaxValue = 65535;
    char charBinaryVar = 0b1111111111111111;
    char charOctalVar = 0177777;
    char charHexaDecimalVar = 0xFFFF;
    char c = 0XFFFF;
    char charUnicodeVar = '\uffff';
    char c1='\b';
    char c2='\n';
    char c3='\t';
    char c4='\f';
    char c5='\r';
    char c6='\f';
    char c7='\\';
    char c8='\'';
	
	//boolean Literal
	boolean b1=true;
	boolean b2=false;

```  