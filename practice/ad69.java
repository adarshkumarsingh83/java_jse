/* MULTI THREADING   AND SLEEP FUNCTION IS CALLED*/

import java.io.*;

class ad69
{
 public static void main(String args[])
 {
    try
      {

      System.out.println("ENTER THE STRING FOR 1 PROCESS");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String s1=(br.readLine());


      System.out.println("ENTER THE STRING FOR 2 PROCESS");
      String s2=(br.readLine());


      Mythread Mt1= new Mythread(s1);
      Thread  t1= new Thread(Mt1);
      t1.start();

      Mythread Mt2= new Mythread(s2);
      Thread t2=new Thread(Mt2);
      t2.start();

      }catch(Exception e)
      { System.out.println("ERROR GENERATED IN THE PROGRAM");
         System.out.println(""+e); }


      finally
      { System.out.println("thank you"); }

 }

}

/*---------------------------------------------------------------------*/


class Mythread implements Runnable
{

 String name;

Mythread(String s)
 { name = s;}

 public void run()
 {
  try
  {
     for(int i=0;i<25;i++)
        {  System.out.println(i +"   -  "+name);
               Thread.sleep(1000);  }

   }catch(InterruptedException e)
   { System.out.println("ERROR GENERATED  X"+e); }
 

 }

}

