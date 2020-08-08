/* DISPLAYING THE FILE HAVING EXTENTION INPUTED AT RUN TIME  */

 import java.io.*;



class ad64
{
 public static void main(String args[])
 {

    try
      {

      System.out.println(" ENTER THE FILE NAME ");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      File f=new File(br.readLine());

      System.out.println(" ENTER THE EXTENTION ");
      String ext=(br.readLine());


   /* making of object of interface Myfilter
      and passing the inputed extention */
       Myfilter mf=new Myfilter(ext);  


   /* making the variable of filenamefilter
   and assing the value of  Myfilter interface*/
         FilenameFilter ff=mf;


   String a[]=f.list(ff);

   for(int i=0;i<a.length;i++)
       {     System.out.println(i+"   "+a[i]);    }


      }catch(Exception e)
      { System.out.println(" ERROR GENERATED IN THE PROGRAM ");
           System.out.println(" "+e);  }

     finally
     {   System.out.println(" THNAK YOU ");  }

 }

}




/*-----------------------------------------------------------------*/

    
/*----------------IMPLEMENTING MYFILTER INTERFACE -----------------*/



 class Myfilter implements FilenameFilter
{

 String s1;

public Myfilter(String str)
 {   s1=str;  }

public boolean accept(File dir, String f)
 { return f.endsWith(s1);  }

}












