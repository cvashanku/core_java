//exception handle by using throws clause

class demo
{ 
  void cube(int a) throws NegativeNumberException
   {
     if(a>0)
       System.out.println(a*a*a);
     else
       throw new NegativeNumberException();
   }
  public static void main(String args[]) throws NegativeNumberException
   {
        int x=Integer.parseInt(args[0]);
        demo d=new demo();
        d.cube(x);
    }
}