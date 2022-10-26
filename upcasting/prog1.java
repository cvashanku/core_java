//upcasting
class A{}
class B extends A{}
class demo
{
 void set(A a)
 {
 }
 public static void main(String args[])
 {
  B b=new B();
  demo d=new demo();
  d.set(b);//A a=b;---->valid upcasting
 }
}