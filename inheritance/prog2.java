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
  B ob=new B();
  System.out.println(ob.x);
  ob.show();
  System.out.println(ob.y);
  ob.print();
 }
}