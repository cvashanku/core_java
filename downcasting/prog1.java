//invalid downcasting
class A{}
class B extends A{}
class demo
{
 A get()
 {
  A a=new B();//valid upcasting
  return a;
 }
 public static void main(String args[])
 {
  demo d=new demo();
  B b=d.get();
 }
}