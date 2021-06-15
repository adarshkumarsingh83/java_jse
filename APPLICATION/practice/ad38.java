/* EXCEPTION HANDLING */


class ad38
{
public static void main(String args[])
  {
   int a,b,c=0;

    try
    {

    a=Integer.parseInt(args[0]);
    b=Integer.parseInt(args[1]);

    c=a+b;
    System.out.println(" SUM  "+c);

    c=a-b;
    System.out.println(" SUBTRACTION  "+c);

    c=a/b;
    System.out.println(" DEVISION  "+c);

    c=a*b;
    System.out.println(" PRODUCT  "+c);

    }

  
    catch( ArrayIndexOutOfBoundsException ae)
    {  System.out.println(" insufficent argument  "+ ae);   }

    catch( NumberFormatException be)
    {  System.out.println(" invalid argument  "+ be);       }

    catch( ArithmeticException ce)
    {  System.out.println("  secound is zero "+ ce);        }
  
  
     {  System.out.println(" THANK YOU  "); }

  
  }

}
 
