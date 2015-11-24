/* FILE PROG FILE NAME IS IMPUTED AT
  CMD LINE AND PRINTING OF  FILE END S WITH TXT */


  
import java.io.*;

class ad61
{

 public static void main(String args[])
 {

    try
      {

      

     File f=new File(args[0]);

     String ext=(args[1]);

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
