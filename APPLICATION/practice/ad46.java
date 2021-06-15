import pack .*;

class ad46
{
 public static void main(String args[])
 {

   try
      {

        int i=Integer.parseInt(args[0]);
        int j=Integer.parseInt(args[1]);
        int k=Integer.parseInt(args[2]);
        String l=args[3];

       calper c=new calper(i,j,k,l);
       c.calper();
       c.calg();
       c.display();



      }catch(Exception e)
       {
         System.out.println("ERROR GENERATED ");
         System.out.println(" "+e); }


      finally
      { System.out.println("THANK YOU ");
         System.out.println("  -*-    "); }
 }

}
