class A
{
 A()
 {
  this(20);
  System.out.println("A classs");
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
  System.out.println("B class");
 }
 B(int y)
 {
  this();
  System.out.println(y);
 }
 public static void main(String[] args)
 {
  new B(10);
 }
}