
/*run time input from user
  FILE BASED PROG READING FILE WITH READLINE FUNCTION  */

import java.io.*;

class ad50
{
 public static void main(String args[])
 {

   try
      {

     BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("ENTER THE NAME OF THE FILE");
     FileInputStream f=new FileInputStream(b.readLine());
      
     
      int  s=f.read();
           if(s==(-1))
         {  System.out.println("FILE CANNOT OPEN "); }
      else
      {
       while(true)
       {
        s = f.read();

        if(s==(-1))
         {  break; }
        else
         { System.out.print((char)s); }
       }

       f.close();

      }

      }catch(Exception e)
      { System.out.println("ERROR GENERATED IN THE PROGRAM ");
        System.out.println(""+e);}

     finally
     { System.out.println(" THANK YOU ");}
 }

}
