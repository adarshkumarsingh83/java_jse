/* USER DEFINE EXCEPTION CLASS  */


class ad44
{
 public static void main(String args[])
 {
   try
      {
   int i=Integer.parseInt(args[0]);
   int j=Integer.parseInt(args[1]);
   String a=args[2];
    try
      {
         Student s =new Student (i,a,j);
         s.display();


       }
       catch(markException e)
         {  System.out.println("ERROR GENERATED IN STUDENT CLASS");
            System.out.println(""+e); }

        }
       catch(Exception ae)
         {  System.out.println("ERROR GENERATED IN PROGRAM ");
            System.out.println(""+ae); }


      finally
       { System.out.println("  THANK YOU");  
         System.out.println("     -*-   ");  }
 }
}


/*--------------------------------------------------------------*/

 class Student
 {
  int rno,mark;
  String name;

  Student (int r,String n, int m)throws markException
   {
    rno=r;
    name=n;

     if((m<0)||(m>100))
     throw new markException(m); 

     else
     mark =m;
   }


   void display()
    {
    System.out.println("     STUDENT ");
    System.out.println("  ROLL NO "+rno);
    System.out.println("  NAME  "+name);
    System.out.println("  MARKS  "+mark);
    }
 }


/*-------------------------------------------------------------------*/

 class markException extends Exception
 {
  int m;

   markException(int m1)
   { m=m1;  }

   public String toString()
   {
    String msg="   ";
    if(m<0)
    msg="NEGATIVE MARKS ARE NOT ALLOWED";
    if(m>100)
    msg="MARKS OUT OF RANGE";

    return(msg);
   }

 }




