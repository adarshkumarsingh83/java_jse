/* READING FILE FROM READLINE METHOD  */

import java.io.*;

class ad59
{
 public static void main(String args[])
 {
   try
     {

       System.out.println("ENTER THE FILE NAME ");
       BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
       FileInputStream fp=new FileInputStream(b.readLine());

       BufferedReader br=new BufferedReader(new InputStreamReader(fp));
      String str=" ";
      do
      {

       str=br.readLine();
       System.out.println(""+str);

      }while(!str.equals("null"));


     }catch(Exception e)
     { System.out.println(" ERROR GENERATED IN PROGRAME  ");
       System.out.println(""+e); }

   finally
   { System.out.println(" WORK OVER "); }


 }

}
