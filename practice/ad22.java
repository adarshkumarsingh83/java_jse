
/*REVERSE PRINTING OF NAME  */

class ad22
{
public static void main (String args[]) 
{

 int i=0,l=0,w=0;
 char s;
 char a[]=new char [50];

  l=args[0].length();



   for(i=0;i<l;i++)
  {
   a[i]=args[0].charAt(i);
  }


  for(i=(l);i>=0;i--)
  {
  if(a[i]==' '||i==0)
  {
   for(int j=(l-w);j<=l;j++)
    {
    System.out.print(""+ a[j]);
    }
    System.out.print("  ");
    l=(l-w)-1;
    w=0;
    }

   else
    w++;
  }
  
}


}
