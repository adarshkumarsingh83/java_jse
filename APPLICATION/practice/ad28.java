/* PARAMETERISIED CONSTRUCTOR  */

class ad28
{
 public static void main(String args[])
 {
  rectangle r1=new rectangle(5,10);
  r1.display();
  r1.cal();

  rectangle r2=new rectangle(10,15);
  r2.display();
  r2.cal();

 }

}

/*=======================================================================*/
class rectangle
{
 int length;
 int breath;

 rectangle(int l,int b)
 {
    length =l;
    breath =b;
 }


  void display()
  {
   System.out.println("");
   System.out.println("LENGTH "+length);
   System.out.println("BREATH "+breath);
  }


   void cal()
   {
    int ar;
    ar=length * breath;

   System.out.println("AREA OF THE RECTANGLE "+ar);

   }

}
