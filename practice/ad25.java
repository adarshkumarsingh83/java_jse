


class ad25
{
public static void main (String args[]) 
{

 int i=0,l=0;
 char o=32;
 
 char a[]=new char [50];

  l=args[0].length();

   for(i=0;i<l;i++)
  {
   a[i]=args[0].charAt(i);
  }

   
  for(i=0;i<l;i++)
    {
    System.out.println(+a[i]-o);
    }


}


}

