class ad20
{
public static void main (String args[]) 
{

 int i=0,w=1;
 char s;


   for(i=args[0].length()-1;i>=0;i--)
  {
   s=args[0].charAt(i);
     if(s==' ')
        w++;
    }

  System.out.println(" "+w);
}


}
