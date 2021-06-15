
/*  */



class ad32
{
 public static void main(String args[])
 {
  student s1=new student("ADARSH",20,30,70,80);
  s1.display();

  student s2=new student("AMIT",70,85,90,67);
  s2.display();

  student s3=new student("ANUP",00,8,90,67);
  s3.display();


  student s4=new student("SUNIL",70,85,90,67);
  s4.display();

  student s5=new student("RAJEEV",70,45,59,67);
  s5.display();

 }

}

/*=======================================================================*/
class student
{
 static int c;
 int rno;
 String name;
 int m1;
 int m2;
 int m3;
 int m4;

 static
 {
  c=100;
 }

 student(String n,int a,int b,int c,int d)
 {
    rno =c;
    name=n;
    m1=a;
    m2=b;
    m3=c;
    m4=d;

    c=c+1;
 }


  void display()
  {
   System.out.println("");
   System.out.println("ROLL NO "+rno);
   System.out.println("NAME "+name);
   System.out.println("MARKS "+m1);
     cal (m1);
   System.out.println("MARKS "+m2);
     cal (m2);
   System.out.println("MARKS "+m3);
     cal (m3);
   System.out.println("MARKS "+m4);
     cal (m4);
  }

   void  cal(int m)
   {
    if(m<=50)
    {
    System.out.println("FAIL  ");
    }
    else if (m>50 && m<=65)
    {
     System.out.println("GRADE D ");
    }
    else if(m>65 && m<=75)
    {
     System.out.println("GRADE C ");
    }
    else if(m>75 && m<=85)
     {
      System.out.println("GRADE B ");
     }
     else if(m>85 && m<=95)
     {
      System.out.println("GRADE A ");
     }
     else if(m>95 && m<=100)
     {
      System.out.println("GRADE S ");
     }
     else
     {
      System.out.println("INVALID NUMMBER ");
     }
   }
}
