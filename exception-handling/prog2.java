//program to demonstrate unchecked exception

class demo
{
  public static void main(String args[])
   {
     try{
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=x/y;
        System.out.println(z);
       }catch(RuntimeException re)
       {
         System.err.println("please pass two numbers and seond number except zero");
       }
    }
}