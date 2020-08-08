/*simple cmd line argument prog of int array*/


class ad12
{

public static void main(String args[])
{

 int   x=0;
 int arr[]=new int[10];

 for(int i=0;i<args.length;i++)

   arr[i]=Integer.parseInt(args[i]);



  for(int i=0;i<args.length;i++)
  System.out.println("array  "   +arr[i]);

}



}
