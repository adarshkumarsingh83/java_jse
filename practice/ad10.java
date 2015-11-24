/*    */

class ad10
{
 public static void main(String args[])

  {
   int marks[]=new int[50];

   int l=args.length;
  System.out.println(" RESULT OF THE MARKS  ");

    for(int i=0;i<l;i++)
   {   marks[i]=Integer.parseInt(args[i]); }


   String  g="f";

   for(int i=0;i<l;i++)
     {
      if(marks[i]<50)
       { g ="f";}

      else if (marks[i]<55)
        { g ="d";}
      
      else if(marks[i]<65) 
         { g ="c"; }
      
      else if(marks[i]<75)  
          { g ="b";}

      else if(marks[i]<85)   
          { g="a";}

      else if(marks[i]<=100)  
            { g ="s"; }

      else if (marks[i]>100)

       { g ="INVALID MARKS" ;}
       

     System.out.println(" marks " + marks[i]);
     System.out.println(" GRADE "+ g);

     }

  }

}
