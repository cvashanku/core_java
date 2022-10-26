//abstract class can have static members and those members can be accessed by using class name
abstract class A
{
  static void show()
  {
   System.out.println("welcome");
  }
}
class B extends A
{
 public static void main(String args[])
 {
  A.show();
  B.show();
 }
}