
/* CMD LINE ARGUMENT INTEGER AND STRING BOTH  */


class ad45
{
 public static void main(String args[])
 {

    try
       {
        int i=0,k=0;
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        String e= args[2];



        System.out.println("  ROLL NUMBER "+a);
        System.out.println("  MARKS       "+b);
        System.out.println("  NAME        "+e);
        
          

       }catch(Exception e)
        {
        System.out.println("ERROR GENERATED  ");
        System.out.println(""+e);
        }

      finally
      { System.out.println("THNAK YOU ");
        System.out.println("   -*-    "); }
 }

}
