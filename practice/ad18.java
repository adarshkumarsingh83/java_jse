/**/

class ad18
{
public static void main(String args[])
 {

  int a[]=new int[9];


   for(int i=0;i<9;i++)
   {
   a[i]=Integer.parseInt(args[i]);
   }

      System.out.println("   ");


   for(int i=0;i<9;i++)
    {
      if(i==3||i==6)
          {
          System.out.println("   ");
          System.out.println("   ");
          System.out.print("   "+ a[i]);

          }
      else
          {
          System.out.print("   "+ a[i]);
          }
     }
 }

}
