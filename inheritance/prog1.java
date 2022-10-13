class A
{
 int x=10;
 void show()
 {
  System.out.println("A class");
 }
}
class B extends A
{
 int y=20;
 void print()
 {
  System.out.println("B class");
 }
 public static void main(String[] args)
 {
  B ob1=new B();
  ob1.show();
  ob1.print();
  System.out.println(ob1.x);
  System.out.println(ob1.y);
 }
}