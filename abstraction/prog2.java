//abstract class can have constructor those constructors are called whenever objects are created to sub class
abstract class A
{
  A()
  {
   System.out.println("welcome");
  }
}
class B extends A
{
  public static void main(String args[])
  {
   new B();
  }
}