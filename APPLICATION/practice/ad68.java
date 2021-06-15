/* MULTI THREADING   */

import java.io.*;

class ad68
{
 public static void main(String args[])
 {
    try
      {

      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

      System.out.println("ENTER THE MINIMUN RANGE FOR EVEN NUMBER ");
      int mineven=Integer.parseInt(br.readLine());
      System.out.println("ENTER THE MAXIMUN RANGE FOR EVEN NUMBER");
      int maxeven=Integer.parseInt(br.readLine());



      System.out.println("ENTER THE MINIMUN RANGE FOR ODD NUMBER ");
      int minodd=Integer.parseInt(br.readLine());
      System.out.println("ENTER THE MAXIMUN RANGE FOR ODD NUMBER");
      int maxodd=Integer.parseInt(br.readLine());


      System.out.println("ENTER THE MINIMUN RANGE FOR NATURAL NUMBER ");
      int minnat=Integer.parseInt(br.readLine());
      System.out.println("ENTER THE MAXIMUN RANGE FOR NATURAL NUMBER");
      int maxnat=Integer.parseInt(br.readLine());



      Even ev=new Even(mineven,maxeven);
      Thread  t1= new Thread(ev);
      t1.start();

      Odd od=new Odd(minodd,maxodd);
      Thread t2=new Thread(od);
      t2.start();

      Nnumber nt=new Nnumber(minnat,maxnat);
      Thread t3=new Thread(nt);
      t3.start();


      }catch(Exception e)
      { System.out.println("ERROR GENERATED IN THE PROGRAM");
         System.out.println(""+e); }


      finally
      { System.out.println("THANK YOU"); }

 }

}

/*---------------------------------------------------------------------*/


class Even implements Runnable
{

 int n1,n2;

 Even(int no1,int no2)
   { n1 = no1;
     n2 = no2; }

 public void run()
   {
    for(int i=n1;i<=n2;i++)
    { if((i%2)==0)
     System.out.println(" EVEN NUMBER "+i);}
 }

}


/*-------------------------------------------------------------------------*/

class Odd implements Runnable
{

 int n1,n2;

 Odd(int no1,int no2)
    { n1 = no1;
      n2 = no2; }

 public void run()
   {
    for(int i=n1;i<n2;i++)
    { if((i%2)!=0)
      System.out.println("ODD NUMBER  "+i); }
 }

}

/*------------------------------------------------------------------------*/

class Nnumber implements Runnable
{

 int n1,n2;

 Nnumber(int no1,int no2)
   { n1 = no1;
     n2 = no2; }

 public void run()
   {
    for(int i=n1;i<=n2;i++)
    System.out.println("NATURAL NUMBER "+i);
 }

}

/*-------------------------------------------------------------------------*/


