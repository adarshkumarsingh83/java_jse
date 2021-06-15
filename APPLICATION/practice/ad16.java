/* cmd line prog of char ayyay sorting */

class ad16
{
public static void main(String args[])
  {
  int l=args[0].length();
  char t;

  System.out.println(" LENGTH OF ARRAY "+l);

  char a[]=new char[100];

  for(int i=0;i<l;i++)
   {
    a[i]=args[0].charAt(i);
   }



      for(int i=0;i<(l-1);i++)
         {
         for(int j=(i+1);j<l;j++)
          {
            if(a[i]>a[j])
              {
              t=a[i];
              a[i]=a[j];
              a[j]=t;
              }
           }
         }

       for(int i=0; i<l ;i++)
       {
       System.out.println("  "+ a[i]);
       }

  }


}
