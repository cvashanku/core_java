//compile time polymorphism
//program to demonstrate method overloading
class demo
{
 void add(int a, int b)
 {
  System.out.println(a+b);
 }
 void add(int a,int b,int c)
 {
  System.out.println(a+b+c);
 }
 public static void main(String args[])
 {
  demo d=new demo();
  d.add(20,30,40);
  d.add(15,25);
 }
}