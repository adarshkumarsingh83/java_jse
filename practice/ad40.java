/* 2D ARRAY INPUT BY CMD LINE AND PRINT
3X3 MATRIX INPUT ONLY 9 INTEGER VARIABLE */

class ad40
{
 public static void main(String args[])
 {
  int a[][]=new int[3][3];
  int i=0,j=0,k=0;

     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++,k++)
       {  a[i][j]=Integer.parseInt(args[k]); }
     }

     System.out.println(" ");
     System.out.println(" THE PRINTING OF THE MATRIX ");

     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
          {
          {System.out.print(" "+a[i][j]);}
          if(j==2)
            {
              System.out.println(" ");
              System.out.println(" ");
            }
          }
     }



  }
}
