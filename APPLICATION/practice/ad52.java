/*FILE PROG FILE NAME IS IMPUTED AT RUN TIME
  AND LOWER CASE IS CONVERTED INTO UPPERCASE*/

import java.io.*;

class ad52
{

 public static void main(String args[])
 {

    try
      {

     System.out.println("ENTER THE FILE NAME ");

     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     FileInputStream f=new FileInputStream(br.readLine());

      int i=0;
      
         while(true)
         {
         i=f.read();
         if(i==(-1))
         break;
         if(i>=97&&i<=122)
         i=i-32;
         System.out.print((char)i);

        }
      f.close();
      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
