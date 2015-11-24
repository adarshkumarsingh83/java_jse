/* FILE PROG FILE NAME IS IMPUTED AT
  RUN TIME AND PRINTING OF  FIES INASSENDING ORDER */


  
import java.io.*;

class ad55 
{

 public static void main(String args[])
 {

    try
      {

      
     System.out.println("ENTER THE FILE NAME ");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     File fp=new File(br.readLine());
     int f1=0,i=0,d1=0,j=0,k=0,v=0;
     String t=" ";

 /*--------------------COUNTING OF FILE AND DIR--------------------*/

      if(fp.exists())
      {
          if(!fp.isDirectory())
             {   System.out.println("GIVEN NAME IS FILE  "+fp); }
          else
             {
              System.out.println("THE GIVEN NAME IS DIRECTORY "+fp);

                 File a[]=fp.listFiles();
                 for( i=0 ;i<a.length;i++)
                     {
                      if(!a[i].isDirectory())
                        { f1++; }
                      if(!a[i].isFile())
                        { d1++; }
                      }
             }

      }
      else
      { System.out.println("NAME DOES NOT EXISTS ");  }


 /*------------------input file and dir in seperate array------------*/

     String f[]=new String[f1];
     String d[]=new String[d1];
     t=" ";
     k=0;v=0;i=0;j=0;
     

          if(fp.isDirectory())
             {  
                 File a[]=fp.listFiles();

                 for( i=0;i<a.length;i++)
                     {
                      if(!a[i].isDirectory())
                       { t=a[i].getName();
                         f[k]=t;   k++; t=" "; }
                      else
                       {  t=a[i].getName();
                          d[v]=t; v++; t=" ";  }
                      }

             }
 /*--------------------SORTING OF NAMES OF FILES ------------------------*/

      for(i=0;i<f1;i++)
       {
        for(j=(i+1);j<f1;j++)
         {
          if(f[i].compareTo(f[j]) < 0)
           {  t=f[j];
              f[j]=f[i];
              f[i]=t; t=" "; }
         }
       }

 /*----------------------SORTING OF NAMES OF DIR ----------------------*/
      for(i=0;i<d1;i++)
       {
        for(j=(i+1);j<d1;j++)
         {
          if(d[i].compareTo(d[j]) < 0)
           {  t=d[j];
              d[j]=d[i];
              d[i]=t;  }
         }
       }


 /*-------------------------PRINTING OF FILES NAMES -------------------*/
     System.out.println("");
     System.out.println("FILES IN THE DRIVES ");
     System.out.println("");

     for(i=0;i<f1;i++)
        {  System.out.println(i+"  NAMES OF FILE "+f[i]);   }

     System.out.println("");
     System.out.println("DIRECTORIES IN DRIVES");
     System.out.println("");

     for(i=0;i<d1;i++)
        {  System.out.println(i+"  NAMES OF DIR "+d[i]);   }


      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
