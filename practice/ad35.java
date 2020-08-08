/* INHARITANCE AND SUPER KEYWORD  */

class ad35
{
 public static void main(String args[])
 {
  System.out.println("");
  student s1=new student();
  s1.accept(100,"SONU","AA");
  s1.display();


  System.out.println("");
  olevel o1=new olevel();
  o1.accept(101,"ADARSH","O",40,50,69,67,45);
  o1.display();

  System.out.println("");
  alevel a1=new alevel();
  a1.accept(101,"AMIT","A",40,50,69,67,67);
  a1.display();

  System.out.println("");
  blevel b1=new blevel();
  b1.accept(101,"SUNIL","B",40,50,69,67,78);
  b1.display();


 }

}

/*--------------------------------------------------------------------*/
 class student
 {
  int rno;
  String na,ba;

  void accept(int r,String n,String b)
  {
   rno=r;
   na=n;
   ba=b;
  }

  void display()
  {
   System.out.println("ROLL NO  "+rno);
   System.out.println("NAME     "+na);
   System.out.println("BATCH    "+ba);
  }

}

/*------------------------------------------------------*/

class olevel extends student
{
 int hindi,english,math,sst,science;

 void accept(int r,String n,String b, int h,int e,int m,int s,int sc)
 {
  super.accept(r,n,b);

  hindi=h;
  english=e;
  math=m;
  sst=s;
  science=sc;
 }

  void display()
  {
   super.display();
   System.out.println("MARKS IN HINDI "+hindi);
   System.out.println("MARKS IN ENGLISH "+english);
   System.out.println("MARKS IN MATH "+math);
   System.out.println("MARKS IN  SST "+sst);
   System.out.println("MARKS IN SCIENCE "+science);
  }

}




/*------------------------------------------------------*/

class alevel extends student
{
 int dbms,dcn,ds,java,unix;

 void accept(int r,String n,String b, int h,int e,int m,int s,int sc)
 {
  super.accept(r,n,b);

  java=h;
  ds=e;
  dbms=m;
  dcn=s;
  unix=sc;
 }

  void display()
  {
   super.display();
   System.out.println("MARKS IN JAVA "+java);
   System.out.println("MARKS IN DS "+ds);
   System.out.println("MARKS IN DBMS "+dbms);
   System.out.println("MARKS IN  DCN "+dcn);
   System.out.println("MARKS IN UNIX "+unix);
  }

}



/*------------------------------------------------------*/

class blevel extends student
{
 int c,co,sad,it,bs;

 void accept(int r,String n,String b, int h,int e,int m,int s,int sc)
 {
  super.accept(r,n,b);

  c=h;
  co=e;
  sad=m;
  it=s;
  bs=sc;
 }

  void display()
  {
   super.display();
   System.out.println("MARKS IN C LANG "+c);
   System.out.println("MARKS IN CO "+co);
   System.out.println("MARKS IN SAD "+sad);
   System.out.println("MARKS IN  IT "+it);
   System.out.println("MARKS IN BS "+bs);
  }

}



/*------------------------------------------------------*/

