//upcasting
class A{}
class B extends A{}
class demo
{
 B get()
 {
   B b=new B();
   return b;
 }
 public static void main(String args[])
 {
  demo d=new demo();
  A a=d.get();//A a=b;---->valid upcasting
 }
}
