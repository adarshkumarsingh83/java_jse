
/*  */



class ad31
{
 public static void main(String args[])
 {
  stock s1=new stock("rice",20,4);
  s1.display();
  s1.cal();

  stock s2=new stock("suger",10,5);
  s2.display();
  s2.cal();
 }

}

/*=======================================================================*/
class stock
{
 static int c;
 int code;
 String name;
 int price;
 int qty;

 static
 {
  c=100;
 }

 stock(String n,int p,int q)
 {
    code =c;
    name=n;
    price=p;
    qty=q;
    c=c+1;
 }


  void display()
  {
   System.out.println("");
   System.out.println("CODE "+code);
   System.out.println("NAME "+name);
   System.out.println("PRICE "+price);
   System.out.println(" QTY "+qty);
  }

   void cal()
   {
    int t;

    t=qty*price;

    System.out.println("TOTAL BILL "+t);
   }
}
