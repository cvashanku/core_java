//"HAS-A" relationships in java
class A
{
 void show()
 {
  System.out.println("has a relationship");
 }
}
class B
{
 A a=new A();
 public static void main(String args[])
 {
  B b=new B();
  b.a.show();
 }
}