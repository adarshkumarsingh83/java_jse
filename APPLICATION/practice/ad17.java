class ad17
{
public static void main(String args[])
  {

   int l;
  
   int a[]=new int[10];
   



   for(int i=0;i<args.length;i++)
   a[i]=Integer.parseInt(args[i]);
    l=a.length;

   System.out.println("    ");

   int j,k,o,m;
   for(int i=0;i<=l;i++)
      {
        j=a[i]/10;
        k=a[i]%10;
        o=j%10;
        m=j/10;
       {

       System.out.print(" "+k);
       System.out.print(" "+o);
       if(m!=0)
       {
        System.out.println("  "+m);
       }
        System.out.println("  ");
       }
      }


  }

}
