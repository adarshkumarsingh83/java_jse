/*NAME IS IMPUTED AT RUN TIME AND
  CHEACKED WEATHER IY IS DIR OR ELSE */


  
import java.io.*;

class ad56

{

 public static void main(String args[])
 {

    try
      {

     System.out.println("ENTER THE NAME  ");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
     File fp = new File(br.readLine());
     int z=0,d=0;

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
                  {z++;  System.out.println(i+ " FILE "+b[i]);  }
                else
                  {d++;  System.out.println(i+ " DIR "+b[i]);  }
             }

             System.out.println(" TOTAL NO OF FILES "+z);
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
