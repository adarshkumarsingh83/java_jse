class x
{
public static void main(String args[])
{
StringBuffer s=new StringBuffer(args[0]);
StringBuffer x=s.reverse();
String s2=new String(x);
if(args[0].equals(s2))
System.out.println("Palendrone");
else
System.out.println("Not Palendrone");
}
}
