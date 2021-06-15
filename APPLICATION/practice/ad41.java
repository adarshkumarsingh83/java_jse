class ad41
{
 public static void main(String args[])
 {

   try
     {
       int a[]=new int[10];
       int i=0;

        try
        {

          for(i=0;i<10;i++)
            a[i]=Integer.parseInt(args[i]); 

               try
               {
                 for(i=0;i<args.length;i++)
                 {
                       int r=100/a[i];
                      System.out.println("DIVISION OUTPUT "+r);  
                 }

                }catch(ArithmeticException ce)
                 { System.out.println("INPUT CONTAINE NON INTEGER VALUE "); 
                   System.out.println("  "+ce); }
              

           }catch(ArrayIndexOutOfBoundsException be)
            { System.out.println("ONLY 10 VALUE IS REQUIRED "); 
              System.out.println("  "+be); }
         

        }catch(NumberFormatException ae)
         { System.out.println("INPUT CONTAINE NON NUMERIC VALUE"); 
          System.out.println("  "+ae); }

     finally
     { System.out.println("THANK YOU "); }

 }

}
