/* imput from keyboard */


import java.io.*;

class ad47
{
 public static void main(String args[])
 {
  int rno,ag;

   try
     {

      BufferedReader br = new BufferedReader
      (new InputStreamReader(System.in));


      try
      {
      System.out.println("ENTER THE ROLL NUMBER ");
      rno=Integer.parseInt(br.readLine());
      }
      catch(NumberFormatException e1)
      { System.out.println("NUMERIC VALUE");
        System.out.println(""+e1); }

           
      System.out.println("ENTER THE NAME   ");
      String n=(br.readLine());
    


      try
      {
      System.out.println("ENTER THE AGE  ");
      ag=Integer.parseInt(br.readLine());
      }
      catch(NumberFormatException e2)
       { System.out.println("NUMERIC VALUE");
         System.out.println(""+e2); }


      System.out.println("ROLL NUMBER "+rno);
      System.out.println("NAME "+n);
      System.out.println("AGE  "+ag);



     }
     catch(IOException e)
     { System.out.println("ERROR GENERATED ");
       System.out.println(""+e); }

    finally
    { System.out.println("THANK YOU"); }


 }
}
