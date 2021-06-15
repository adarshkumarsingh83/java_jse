/*cmd lime prog of int array sorting  */


class ad14
{

public static void main(String args[])

{
  int a[]=new int[50];
  int l=0;


  for(int x=0;x<args.length;x++,l++)
  a[x]=Integer.parseInt(args [x]);
  


        System.out.println("ELEMENT IN ARRAY   " + l);

   int t=0;

  for(int i=0;i<l;i++)
    {
       
    for(int j=(i+1);j<=l;j++)
       {
           if(a[i]>a[j])
           {
           t=a[i];
           a[i]=a[j];
           a[j]=t;
           }
       }

    }


    for(int k=1;k<=l;k++)

    {
    System.out.print("  " +k);
    System.out.println(":-> sorted array   " +a[k]);
    }


}


}
