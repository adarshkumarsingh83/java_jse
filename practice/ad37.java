/* METHOD OVERRIDING  */

class ad37
{
 public static void main(String args[])
 {

   System.out.println("");
   System.out.println(" PRINTING WITHOUT REFERENCE VARIABLE ");
   System.out.println("-------------------------------------");
   shape s1=new shape();
   s1.calarea();

   System.out.println("");
   circle c1 = new circle(3.21);
   c1.calarea();

   System.out.println("");
   rectangle r1=new rectangle(5,8);
   r1.calarea();

 
  System.out.println("");
  System.out.println("");
  System.out.println(" REFERENCE VARIABLE PRINTING ");
  System.out.println("-----------------------------");
  shape res;
  res=s1;
  res.calarea();

  System.out.println("");
  res=c1;
  c1.calarea();

  System.out.println("");
  res=r1;
  r1.calarea();

 }

}


/*-----------------------------------------------------------------*/
class shape
{

 void calarea()
 {
 System.out.println(" SHAPE IS NOT DEFINED ");
 }
}

/*-----------------------------------------------*/


class circle extends shape
{
 double rad;

 circle(double r)
 {
  rad=r;
 }

 void calarea()
 {
  double ar = 3.14 * rad * rad;
  System.out.println(" AREA OF THE CIRCLE "+ar);
 }

}

/*-------------------------------------------------*/


class rectangle extends shape
{
 int l,b;

 rectangle(int l1,int b1)
 {
  l=l1;b=b1;
 }

  void calarea()
  {
   double ar=l*b;
   System.out.println(" AREA OF THE RECTANGLE "+ar);
  }

}



