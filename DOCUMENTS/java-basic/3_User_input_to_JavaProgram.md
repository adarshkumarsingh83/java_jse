## Cmd Prompt
```
  public class CmdLineArgsTest{

	  public static void main(String ...args){  
	   int index=0;
			if(args != null && args.length > 1){
			   for(String arg:args){
				 System.out.println("Arguments "+index+" "+arg);
				 index++;
			   }	   
			}else{
			  System.out.println("Cmd Line Input is Not Provided by User ");
		   }
	  }
}

> javac Test.javac
>java Test a b c d e f g h i j k l m n o p q r s t u v w x y z
```

## BufferedReader
```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTest {

    public static void main(String[] args)throws Exception{
        final BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Value ");
        final String dataInput=bufferedReader.readLine();

        System.out.println("Data Enter by User "+dataInput);
    }
}
```


## Scanner 
```
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args)throws Exception{
        final Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Value ");
        final String dataInput=scanner.nextLine();

        System.out.println("Data Enter by User "+dataInput);
    }
}
```

## Console
```
this will work on cmd prompt only 
.................................

import java.io.Console;

public class ConsoleTest{

    public static void main(String[] args) throws Exception {
        final Console console = System.console();

            final String dataInput = console.readLine("Enter the Data ? ");

            System.out.println("Data Enter by User " + dataInput);
        }
}
>

>javac Test.java
>java Test

Enter the Data ? hi this is adarsh
Data Enter by User hi this is adarsh
```

## DataInputStream 
```
import java.io.DataInputStream;

public class DataInputStreamTest {
    public static void main(String[] args) throws Exception{
        DataInputStream dataInputStream=new DataInputStream(System.in);
        System.out.println("Enter the Data : ");
        final String data=dataInputStream.readLine();
        System.out.println("Data Enter  "+data);
    }
}
```