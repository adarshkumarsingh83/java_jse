/*FILE PROG FILE NAME IS IMPUTED AT
  RUN TIME AND MATCHING
  AND WORD INPUTED AND OCCERANCE */


  
import java.io.*;

class aa
{

 public static void main(String args[])
 {

    try
      {

      
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


     System.out.println("ENTER THE WORD FOR SEARCHING  ");
    String o=(br.readLine());
    char p=o.charAt(0);

     char x=(toCodePoint(p));
     System.out.println(""+x);


      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
