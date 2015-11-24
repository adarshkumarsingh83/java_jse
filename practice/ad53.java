/*FILE PROG FILE NAME IS IMPUTED AT
  RUN TIME 
  AND ODD LINES ARE PRINTED */


import java.io.*;

class ad53
{
 public static void main(String args[])
 {

    try
      {

     System.out.println("ENTER THE FILE NAME ");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     FileInputStream f=new FileInputStream(br.readLine());


      int i=0,k=0;

      while(true)
      {

        i=f.read();

        if(i==(-1))
          { break; }
      
        else
          {

          if(i=='\n')
            {  k++; }

          if((k % 2) == 0)
            {  System.out.print((char)i); }

          }             
      }
     
      f.close();

  
      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
