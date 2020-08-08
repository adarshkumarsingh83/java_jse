/* TILLE CASE PROGRAM  */


class ad24

{
public static void main (String args[]) 
{

 int i=0,l=0;
 
 char a[]=new char [50];

  l=args[0].length();

     for(i=0;i<l;i++)
  {
   a[i]=args[0].charAt(i);
  }

  a[0]=(char)(a[0]-32);
  System.out.print(""+ a[0]);
  for(i=1;i<l;i++)
  {
  if(a[i]==' ')
  {

   a[i+1]=(char)(a[i+1]-32);
   
    }
      System.out.print(""+ a[i]);
  }
  
}


}
