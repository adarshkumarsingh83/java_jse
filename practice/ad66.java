/*program  which takes txt input at runtime and save it in the file
and reading the txt from that file */

import java.io.*;

class ad66
{
 public static void main(String args[])
 {
    try
      {
        System.out.println("ENTER THE FILE NAME ");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   FileOutputStream  f = new FileOutputStream(br.readLine());

   System.out.println("ENTER THE TEXT ");
   String txt=(br.readLine());

   byte ba[]=txt.getBytes();
   f.write(ba);        /*writing the txt into file */
   f.close();         /*closing the file */



   /*reading the txt of the file */

     System.out.println("ENTER THE FILE NAME ");
   FileReader  fp = new FileReader(br.readLine());
    BufferedReader b=new BufferedReader(fp);
    String s=" ";

     while((s=b.readLine())!=null)
      System.out.println(""+s);

     fp.close();

      }catch(Exception e)
      { System.out.println("ERROR GENERATED UN PROGRAM ");
               System.out.println(""+e);   }

      finally
     { System.out.println("THANK YOU "); }

 }
}

