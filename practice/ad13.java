/*cmd line prog of int array and sum of the array*/


class ad13
{

public static void main(String args[])
{

 int   x=0;
 int arr[]=new int[args.length];

 for(int i=0;i<args.length;i++)

   arr[i]=Integer.parseInt(args[i]);



  for(int i=0;i<args.length;i++)

    {
     x=x+arr[i];
   System.out.println("array  :-> " + arr[i]);

    }

   System.out.println("sum of the array " + x);
}



}
