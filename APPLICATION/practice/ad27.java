/* DEFAULT CONSTRUCTOR */

class ad27
{

public static void main(String args[])
{
 rectangle r1=new rectangle();
 r1.display();
 r1.area();

 rectangle r2=new rectangle();
 r2.display();
 r2.area();

}

}
/*=======================================================================*/

 class rectangle
 {

  int length;
  int breath;

  rectangle()
  {
   length=15;
   breath=20;
  }

  void display()
  {
   System.out.println(" ");
   System.out.println("LENGTH "+length);
   System.out.println("BREATH "+breath);
  }

   void area()
   {
    int ar;

    ar = length * breath;
    System.out.println("AREA OF THE RECTANGLE "+ar);

   }

 }













