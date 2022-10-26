interface A
{
  int x=10;
  void show();
}
class B implements A
{
 int y=20;
 public void show()
 {
  System.out.println("show() method");
 }
 void print()
 {
  System.out.println("print() method");
 }
 public static void main(String args[])
 {
  System.out.println(A.x);
  B ob=new B();
  System.out.println(ob.y);
  ob.show();
  ob.print();
 }
}