class A
{
 A()
 {
  System.out.println("A class");
 }
}
class B extends A
{
 B()
 {
  System.out.println("B class");
 }
 public static void main(String[] args)
 {
  new B();
 }
}