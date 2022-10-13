class A
{
 int x=10;
}
class B extends A
{
 int y=20;
 void print()
 {
  int z=30;
  System.out.println(x);
  System.out.println(y);
  System.out.println(z);
 }
 public static void main(String[] args)
 {
 B ob=new B();
 ob.print();
 }
}