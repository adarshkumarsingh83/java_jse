/*  FILE BASED PROGRAMES READING FILE CHAR BY CHAR
 AND COUNTING  OCCURANCE OF A CHAR INPUTED   */

import java.io.*;

class ad49
{
 public static void main(String args[])
 {

   try
     {

     System.out.println("ENTER THE NAME OF THE FILE ");

     BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
     FileInputStream fs=new FileInputStream(b.readLine());


     System.out.println("ENTER THE CHARACTER ");
     String o=(b.readLine());
     char p=o.charAt(0);  /*char conversition from string*/
     
     int i=0,c=0;

     while(true)
     {

      i=fs.read();

      if(i==(-1))
      { break; }

      else
     {

        if(i==p)         /*CHAR MATCHING*/
        { c++; }

       System.out.print((char)i); }

     }
      fs.close();





      if(c>0)
      { System.out.println("TOTAL NUMBER OF OCCERANCE     "+c); }
      else
{System.out.println("TOTAL NUMBER OF OCCERANCE  IS ZERO AND CHAR NOT FOUND");}

     }catch(Exception e)
     { System.out.println("ERROR GENERTATED IN PROGRAM ");
     System.out.println(""+e); }


     finally
    { System.out.println(" THANK YOU");}
     
 }

}
