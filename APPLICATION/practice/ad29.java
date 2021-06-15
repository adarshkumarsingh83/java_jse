
/* passing and returning of object to any method  */



class ad29
{
 public static void main(String args[])
 {
  rectangle r1=new rectangle(5,10);
  r1.display();
  r1.cal();

  rectangle r2=new rectangle(10,15);
  r2.display();
  r2.cal();

  rectangle r3=r1.join(r2);
  r3.display();
  r3.cal();
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

   rectangle join(rectangle rt)
   {
     int l1=length+rt.length;
     int b1=breath+rt.breath;

     rectangle temp=new rectangle(l1,b1);
     return(temp);
   }
}
