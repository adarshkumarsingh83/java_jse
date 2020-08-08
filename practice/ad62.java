/* FILE PROG FILE NAME IS IMPUTED AT
  CMD LINE AND PRINTING OF  FIES INASSENDING ORDER */


  
import java.io.*;

class ad62
{

 public static void main(String args[])
 {

    try
      {

      

     File f=new File(args[0]);


     String t=" ";
     int fl=0,i=0,j=0,v=0;

  /*--------------------COUNTING OF FILE AND DIR--------------------*/

      if(f.exists())
      {
          if(!f.isDirectory())
             {   System.out.println("GIVEN NAME IS FILE  "+f); }
          else
             {
              System.out.println("THE GIVEN NAME IS DIRECTORY "+f);

                 File a[]=f.listFiles();
                 for( i=0 ;i<a.length;i++)
                     {
                      if(!a[i].isDirectory())
                        { fl++; }
                      }
             }

      }
      else
      { System.out.println("NAME DOES NOT EXISTS ");  }


   /*---------------------SORTING OF FILE ON SIZE BASES-------------*/
     int s[]=new int [fl];
     String n[]=new String[fl];
     String o=" "; t=" ";
     

          if(f.isDirectory())
             {  
              System.out.println("THE GIVEN NAME IS DIRECTORY "+f);

                 File a[]=f.listFiles();
                 for( i=0;i<a.length;i++)
                     {
                      if(!a[i].isDirectory())
                       { o=a[i].getName();
                         s[v]=o.length();
                         n[v]=o;   v++; }
                      }
             }

    /*--------------------SORTING OF NAMES ---------------------------*/

      for(i=0;i<fl;i++)
       {
        for(j=(i+1);j<fl;j++)
         {
          if(s[i]>s[j])
           {
           int t1=s[i];
               t=n[i];

             s[i]=s[j];
             n[i]=n[j];

             s[j]=t1;
             n[j]=t;
           }
         }
       }


  /*-------------------------PRINTING OF FILES NAMES -------------------*/
     for(i=0;i<fl;i++)
        {  System.out.println(i+"  NAMES "+n[i]+"  SIZE "+s[i]);   }

      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
