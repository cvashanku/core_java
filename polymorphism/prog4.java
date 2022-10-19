class demo{}
class demo2 extends demo{}
class A
{
  demo get()
  {
   demo d=new demo();
   return d;
  }
}
class B extends A
{
 demo2 get()
 {
  demo2 d2=new demo2();
  return d2;
 }
 public static void main(String args[])
 {
  A ob=new A();
  demo p=ob.get();
  System.out.println(p);
 }
}