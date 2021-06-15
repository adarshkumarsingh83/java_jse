/* SUPER METHOD */

class ad36
{
public static void main(String args[])
{


  System.out.println("");
  System.out.println("");
  System.out.println(" OUTPUT  ");
  a t1=new a();
  t1.display();
  System.out.println("");

  a t2=new a(25,30);
  t2.display();
  System.out.println("");

  b t3=new b();
  t3.display();
  System.out.println("");

  b t4=new b(50,40);
  t4.display();
  System.out.println("");

  b t5=new b(1,2,3,4);
  t5.display();
  System.out.println("");

}

}

/*-----------------------------------------------------------------*/
class a
{
int a;
int b;

  a()
  {
  a=5;
  b=10;
  }

  a(int a1,int b1)
  {
  a=a1;
  b=b1;
  }

  void display()
  {
  System.out.println(" VALUE OF A "+a);
  System.out.println(" VALUE OF B "+b);
  }
}

class b extends  a
{

 int x;
 int y;

    b()
    {
    x=15;
    y=20;
    }

    b(int x1 ,int x2)
    {
     x=x1;
     y=x2;
    }

    b(int x1 ,int x2 ,int x3 ,int x4)
    {
    super(x1 ,x2);    
     x=x3;
     y=x4;
    }

    void display()
    {
    super.display();    
    System.out.println(" VALUE OF X IS "+x);
    System.out.println(" VALUE OF Y IS "+y);
    }

 }

/*----------------------------------------------------------------------*/
