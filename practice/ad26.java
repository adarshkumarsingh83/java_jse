/* OBJECT CREATION  */

class ad26
{
 public static void main(String args[])
 {
   student s1 = new student();
   s1.accept(10,"adarsh","o1",21);
   s1.display();

   student s2 = new student();
   s2.accept(11,"amit","o2",20);
   s2.display();

 }


}

/*------------------------------------------------------------------------*/

class student
{
 int     rno;
 String  na;
 String  ba;
 int     age;

 void accept(int r,String n,String b,int a)
  {
   rno = r;
   na = n;
   ba = b;
   age = a;
  }

 void display()
  {
   System.out.println("");
   System.out.println("ROLL NO "+rno);
   System.out.println("NAME "+na);
   System.out.println("BATCH "+ba);
   System.out.println("AGE "+age);
   System.out.println("");
  }

}
