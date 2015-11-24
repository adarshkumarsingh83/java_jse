import  pack.*;


class ad46
{
 public static void main(String args[])
 {

   try
      {
        int r=Integer.parseInt(args[0]);
        String n=args[1];
        String b=args[2];

        student s=new  student(r,n,b);
       s.display();

       }catch(Exception e)
        {
        System.out.println("ERROR GENERATED ");
        System.out.println(""+e);
        }


        finally
        {
        System.out.println("THANK YOU ");
         }
 }

}
