class ad42
{
 public static void main(String args[])
 {

   try
     {
       System.out.println(" HELLO ");
       System.out.println(" I AM ADARSH ");

       throw new ArithmeticException();

     }catch(Exception e)
      {System.out.println(" ERROR GENERATED ");
       System.out.println(""+e); }

 }
}
