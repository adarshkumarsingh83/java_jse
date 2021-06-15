/*overloading of the function or  method  */


class ad33
{
 public static void main(String args[])
 {

 System.out.println("");  
  calarea(15.2,10.4);     /*rectangle area calculation*/

 System.out.println("");
  calarea(21.1);           /*area of the circle*/
 }



  /*FUNCTION FOR CALCULATING THE AREA OF THE RECTANGLE*/
 static void calarea(double l,double b)
 {

  double area=l*b;
  System.out.println("AREA OF THE RECTANGLE IS  "+area);
 }


  /*FUNCTION FOR CALCULATING THE AREA OF THE CIRCLE*/
 static void calarea(double r)
 {

   double area =3.14*r*r;      /*3.14 IS THE VALUE OF PIE*/
   System.out.println("AREA OF THE CIRCLE IS  "+area);
 }

}
