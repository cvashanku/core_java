//"IS-A"relationship in java
class A
{
 void show()
 {
  System.out.println("welcome");
 }
}
class B extends A
{
 public static void main(String args[])
 {
  B ob=new B();
  ob.show();
 }
}