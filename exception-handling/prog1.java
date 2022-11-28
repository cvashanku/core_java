//program to demonstrate unchecked exception

class demo
{
  public static void main(String args[])
   {
     try
      {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=x/y;
        System.out.println(z);
      }
     catch(ArrayIndexOutOfBoundsException ae)
         {
            System.err.println("please pass two arguements");
         }
     catch(NumberFormatException ne)
         {
            System.err.println("please pass two numbers only");
         }

     catch(ArithmeticException ae)
         {
            System.err.println("please pass second number except zero");
         }
   }
}