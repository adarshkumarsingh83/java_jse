/* FILE PROG FILE NAME IS IMPUTED AT
  RUN TIME AND PRINTING OF  FILE END S WITH TXT */


  
import java.io.*;

class ad57
{

 public static void main(String args[])
 {

    try
      {

      
     System.out.println("ENTER THE FILE NAME ");

     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     File f=new File(br.readLine());

     System.out.println("ENTER THE FILE EXTENTION ");
     String ext=(br.readLine());

     String t=" ";

      if(f.exists())
      {
          if(!f.isDirectory())
             {   System.out.println("GIVEN NAME IS FILE  "+f); }
          else
             {
              System.out.println("THE GIVEN NAME IS DIRECTORY "+f);

                 File a[]=f.listFiles();
                 for(int i=0 ;i<a.length;i++)
                     {
                      if(!a[i].isDirectory())
                        {
                         t=a[i].getName();
                         if(t.endsWith(ext))
                         {
                          System.out.println(i+ "  FILE  "+(t.toLowerCase())+" SIZE "+t.length());     }
                          else
                          t=" ";
                        }

                     }
             }

      }
      else
      { System.out.println("NAME DOES NOT EXISTS ");  }
     

      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
