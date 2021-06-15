/*FEBONASI SERIES*/


class ad5
{
public static void main(String arr[])
{
int i=0,j=1,k=0;
System.out.println(" FEBONASI SERIES :->  "+i);
System.out.println(" FEBONASI SERIES :->  "+j);
for(int x=1;x<50;x++)
{
   if(k<=500)
   {
    k=i+j;
 System.out.println(" FEBONASI SERIES:->  "+k);
    i=j;
    j=k;
   }
}
}
}
