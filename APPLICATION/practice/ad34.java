/* OVER LOADING OF THE CONSTRUCTOR  */

class ad34
{
 public static void main(String args[])
 {

  rectangle r1= new rectangle ();     /*DEFAULT CONSTRUCTOR*/
  System.out.println("");
  System.out.println("DEFAULT CONSTRUCTOR ");
  r1.display();


  rectangle r2= new rectangle (20,35);   /*PARAMETERISED CONSTRUCTOR*/
  System.out.println("");
  System.out.println("PARAMETERISED CONSTRUCTOR ");
  r2.display();


  rectangle r3= new rectangle (r2);
  System.out.println("");
  System.out.println("PARAMETERISIED CONSTRUCTOR ");
  r3.display();

 }

}

/*----------------------------------------------------------------------*/


class rectangle
{
static int length;
static int breath;


 rectangle()
 {
  length=10;
  breath =15;
 }



 rectangle (int l,int b)
 {
  length=l;
  breath=b;
 }



 rectangle (rectangle rt)
 {
  length=rt.length;
  breath=rt.breath;
 }


 void display()
  {
   System.out.println("LENGTH OF RECTANGLE "+length);
   System.out.println("BREATH OF RECTANGLE "+breath);

  }


}

