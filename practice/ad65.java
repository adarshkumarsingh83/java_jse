/*  SERIALISABLE INTERFACE IMPLEMENTATION */

import java.io.*;

class ad65
{
 public static void main(String args[])
 {

   try
      {

      System.out.println("ENTER THE NAME ");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String n=(br.readLine());

      System.out.println("ENTER THE ROLL NUMBER ");
      String r=(br.readLine());
      int rno=Integer.parseInt(r);

 /*--------------------------------------------------------------------*/
 /* passing name and rolno to student class */
     Student s=new Student(rno,"n");

 /* making object of the FileOutputStrem  */
      System.out.println("ENTER THE FILE NAME ");
      String fn=(br.readLine());
      FileOutputStream f1=new FileOutputStream(fn);

 /* passing the object of file to ObjectOutputStream */
      ObjectOutputStream o = new ObjectOutputStream(f1);

 /*passing the student object to object write function */
      o.writeObject(s);
/*----------------------------------------------------------------------*/
 /* passing name and rolno to student class */
     Student s2;

 /* making object of the FileOutputStrem  */
      System.out.println("ENTER THE FILE NAME ");
      String fn1=(br.readLine());  
      FileInputStream f2=new FileInputStream(fn1);

 /* passing the object of file to ObjectOutputStream */
      ObjectInputStream o1 = new ObjectInputStream(f2);

 s2=(Student)o1.readObject();
   s2.display();

/*----------------------------------------------------------------------*/

      }catch(Exception e)
      {  System.out.println("ERROR GENERATED IN PROGRAM ");
               System.out.println(""+e);      }

      finally
     {  System.out.println("THANK YOU");  }

 }

}

/*======================================================================*/

class Student implements Serializable
{
 int rno;
 String name;

public Student(int r,String na)
 {
  rno =r;
  name = na;
 }

public void display()
 {

  System.out.println("ROLL NO "+rno);
  System.out.println("NAME  "+name);
 }

}


