/*FILE PROG FILE NAME IS IMPUTED AT
  RUN TIME AND MATCHING
  AND WORD INPUTED AND OCCERANCE */


  
import java.io.*;

class ad54
{

 public static void main(String args[])
 {

    try
      {

      
     System.out.println("ENTER THE FILE NAME ");

     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

     FileInputStream f=new FileInputStream(br.readLine());

     System.out.println("ENTER THE WORD FOR SEARCHING  ");
     String w=(br.readLine());
     w=w.trim();

    String s=" ";

      int i=0;
      boolean r=true;

      while(true)
      {
       i=f.read();
       if(i==(-1))
        {  break;  }
       else
        {
         if(i!='\b' && i!='\t' && i=='\n'||i>=65 && i<=90||i>=97 && i<=122)
           { s=s+(char)i;  }
         else
            {

     //      System.out.print(""+i);
     //      System.out.println(""+s);

             s=s.trim();
             r=s.equals(w); 
              if(r==true)
              { break;  }
              else
              { s="  "; }
           }
          }

        }

      f.close();

       if(r==true)
       {  System.out.println("WORD FOUND IS  "+r); }
       else
       { System.out.println("WORD NOT FOUND  "+r);}
     

      }catch(Exception e)
      {System.out.println("ERROR GENERATED");
       System.out.println(""+e); }

     finally
     { System.out.println("THANK YOU"); }

 }

}
