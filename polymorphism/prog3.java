class A
{
 void show()
 {
  System.out.println("A class");
 }
}
class B extends A
{
 void show()
 {
  System.out.println("B class");
 }
 public static void main(String args[])
 {
  A ob=new A();
  ob.show();
 }
}