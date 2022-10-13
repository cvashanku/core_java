class A
{
 void show()
 {
  System.out.println("A class");
 }
}
class B extends A
{
 void show()
 {
  System.out.println("B class");
 }
 void print()
 {
  show();
  this.show();
  super.show();
 }
 public static void main(String[] args)
 {
  B ob=new B();
  ob.print();
 }
}