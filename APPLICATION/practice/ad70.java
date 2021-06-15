/*FILE BASED PROGRAM READING THE SOURSE FILE
  AND WRITING TO DESTINATION FILE */

import java.io.*;

class ad70
{
 public static void main(String args[])
 {
  try
    {

    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("ENTER THE SOURCE FILE NAME ");
    FileInputStream fi=new FileInputStream(br.readLine());

    System.out.println("ENTER THE DESTINATION FILE NAME ");

    FileOutputStream fo=new FileOutputStream(br.readLine());
    int i=0;
    while(true)
    {
     if(i==(-1))
     { break; }
     else
       {
         i=fi.read();
         fo.write(i);
       }
    }
    fi.close();
    fo.close();


    }catch(Exception e)
    {  System.out.println("ERROR GENERATED IN THE PROGRAM ");
      System.out.println(""+e);}

    finally
    {System.out.println("THANK YOU ");}
 }

}
