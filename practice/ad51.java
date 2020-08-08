/*  FILE BASED PROGRAMES READING FILE CHAR BY CHAR
 AND COUNTING NEW LINE AND OCCURANCE OF A CHAR INPUTED   */

import java.io.*;

class ad51
{
 public static void main(String args[])
 {

   try
     {

     System.out.println("ENTER THE NAME OF THE FILE ");

     BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
     String fname=(b.readLine());
     FileInputStream fp=new FileInputStream(fname);


     System.out.println("ENTER THE CHARACTER ");
     String o=(b.readLine());
     char p=o.charAt(0);  /*char conversition from string*/
     
     int i=0,l=0,c=0,v=0,uc=0,lc=0,w=0,n=0;

     while(true)
     {

      i=fp.read();

      if(i==(-1))
      { break; }

      else
     {
        if(i=='\n')      /*NEW LINE FINDING*/
        { n++;}

        if(i==p)         /*CHAR MATCHING*/
        { c++; }

 if(i=='a'|| i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U')
        { v++; }         /*VOVEL MATCHING*/

       if(i>=65&&i<=90)   /*UPPER CASE*/
        {uc++; }

       if(i>=97&&i<=122)  /*LOWER CASE*/
        {lc++; }

       System.out.print((char)i); }

     }
      fp.close();


     FileInputStream f=new FileInputStream(fname);
     String s=" ";
     

  while(true)
  {
   i=f.read();
   if(i==(-1))
    {break; }
   else
    {
     if(i!=32 && i!='\n' && i!='\t')
        {   s=s+(char)i; }
       else
        {
           s=s.trim();
          if(s.length()!=0)
            {  w++;  }

          if(i==32||i=='\t'||i=='\n')
            {
              while(i=='\n'||i=='\b'||i=='\t')
                   { s=" ";   i=f.read(); }

               s=s+(char)i; 
            }
        }

    }

  }
   f.close();


      System.out.println("TOTAL NUMBER OF WORDS                         "+w);
      System.out.println("TOTAL NUMBER OF LINES                         "+n);
      System.out.println("TOTAL NUMBER OF OCCERANCE OF MATCHING CHAR    "+c);
      System.out.println("TOTAL NUMBER OF CHARACTER IN UPPER CASE      "+uc);
      System.out.println("TOTAL NUMBER OF CHARACTER IN LOWER CASE      "+lc);
      if(p>0)
      { System.out.println("TOTAL NUMBER OF OCCERANCE     "+c); }
      else
{System.out.println("TOTAL NUMBER OF OCCERANCE  IS ZERO AND CHAR NOT FOUND");}

     }catch(Exception e)
     { System.out.println("ERROR GENERTATED IN PROGRAM ");
     System.out.println(""+e); }


     finally
    { System.out.println(" THANK YOU");}
     
 }

}
