/* REVERSE PRINTING OF THE EVERY WORD IN THE STRING  */


class ad23
{
public static void main (String args[]) 
{

 int i=0,l=0,w=0;
 char s;
 char a[]=new char [50];

  l=args[0].length();

   int k;

   for(i=0;i<l;i++)
  {
   a[i]=args[0].charAt(i);
  }

   int p=0;

  for(i=0;i<l;i++)
  {
  if(a[i]==' '||i==(l-1))
  {
   for(int j=(w);j>=p;j--)
    {
    System.out.print(""+ a[j]);
    }
    System.out.print("  ");
    p=i;
    w++;
    }

   else
   w++;
  }
  
}


}
