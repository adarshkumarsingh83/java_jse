/* INTERFACE  */

class ad48
{
 public static void main(String args[])
 {
   try
     {
      int x=Integer.parseInt(args[0]);
      int y=Integer.parseInt(args[1]);
      int z=Integer.parseInt(args[2]);

       Circle c = new Circle(x);
       c.calarea();

       Rectangle r = new Rectangle(y,z);
       r.calarea();

     }
     catch(Exception e)
     {
       System.out.println("ERROR GENERATED");
       System.out.println(""+e);
     }

     finally
     { System.out.println("THANK YOU"); }
 }

}

/*------------------------------------------------------------------*/

 interface shape
 {
 void calarea();
 }

/*-------------------------------------------------------------------*/
class Circle implements shape
{
 int r;

 Circle(int r1)
 { r=r1; }

  public void calarea()
 {
  double area=3.14 * r * r;
  System.out.println("AREA OF CIRCLE   "+area);
 }

}

/*-------------------------------------------------------------------*/
 class Rectangle implements shape
 {
  int l,b;

  Rectangle(int l1,int b1)
  {
   l=l1;
   b=b1;
  }

  public void calarea()
  {
   double area=l*b;
   System.out.println("AREA OF RECTANGLE  "+area);
  }

 }

/*-------------------------------------------------------------------*/
