//exception handle by using try and catch block

class demo
{ 
  void cube(int a) throws NegativeNumberException
   {
     if(a>0)
       System.out.println(a*a*a);
     else
       throw new NegativeNumberException();
   }
  public static void main(String args[])
   {
     try
      {
        int x=Integer.parseInt(args[0]);
        demo d=new demo();
        d.cube(x);
       }catch(NegativeNumberException ne)
       {
         System.err.println(ne);
       }
   }
}