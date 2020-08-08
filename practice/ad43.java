/*      */


class ad43
{
 public static void main(String args[])
 {
   int a[]=new int[2];
  try
      {
       for(int i=0;i<2;i++)
        a[i]=Integer.parseInt(args[i]);
        
           try
           {
             int m=a[0];
             int t=a[1];
            double p=calper(m,t);
            System.out.println("PERCENTAGE "+p);

           }catch(ArithmeticException e)
            { System.out.println("ERROR GENERATED ");
               System.out.println(""+e); }

       }
       catch(ArrayIndexOutOfBoundsException ae)
        { System.out.println("ENTER ONLY TWO ARGUMENTS");
          System.out.println(""+ae); }

 }


    static double calper( int m1 , int t1)throws ArithmeticException
           {
            double p = m1 * 100 / t1;

            return (p);
           }

}
/*----------------------------------------------*/


