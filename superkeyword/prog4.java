class A
{
 A()
 {
  this(20);
  System.out.println("A class");
 }
 A(int x)
 {
  System.out.println(x);
 } 
}
class B extends A
{
 B()
 {
  this(10);
  System.out.println("B class");
 }
 B(int y)
 {
  System.out.println(y);
 }
 public static void main(String[] args)
 {
new B();
 }
}