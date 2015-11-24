/* DEFAULT CATCH BLOCK FOR EXCEPTION HANDLING  */



class ad39
{
  public static void main(String args[])
  {
   try
     {
      int x=Integer.parseInt(args[0]);
      int y=Integer.parseInt(args[1]);
      int z=0;

      z=x+y;
      { System.out.println(" SUM "+z); }

      z=x-y;
      { System.out.println(" SUBTRACTION "+z); }

      z=x*y;
      { System.out.println(" PRODUCT "+z); }

      z=x/y;
      { System.out.println(" DIVISION "+z); }

     }

     catch(Exception e)
     { System.out.println(" ERROR GENERATED IS -> " +e);  }

     System.out.println(" THANK YOU ");
  }

}
