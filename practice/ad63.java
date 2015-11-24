/*NAME IS IMPUTED AT CMD LINE AND
  CHEACKED WEATHER IY IS DIR OR ELSE */


  
import java.io.*;

class ad63
{

 public static void main(String args[])
 {

    try
      {

      
     File fp = new File(args[0]);
     String  f1[];
     File  di[];
     int d=0,z=0;

    if(fp.exists())
    {
      if(fp.isFile())
        { System.out.println(" IT IS A FILE  "+fp);}
      else
        {
         System.out.println("IT IS A DIRECTORY  "+fp);

          File b[]=fp.listFiles();

          for(int i=0; i < b.length; i++)
             {
                if(!b[i].isDirectory())
                  {z++;  System.out.println(i+" FILE "+b[i]);  }
                else
                  {d++;  System.out.println(i+" DIR "+b[i]);  }

             }

             System.out.println(" TOTAL NO OF FILES     "+z);
             System.out.println(" TOTAL NO OF DIRECTORY "+d);

         }
     }
     else
     { System.out.println(" NAME DOES NOT EXISTS ");}


      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
