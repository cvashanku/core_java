//run time polymorphism
//program to demonstrate method overriding
class A
{
 void show()
 {
  System.out.println("A class");
 }
 void print()
 {
  System.out.println("print() method");
 }
}
class B extends A
{
 void show()
 { 
  System.out.println("B class");
 }
 void display()
 {
  System.out.println("display() method");
 }
  public static void main(String args[])
  {
   B ob=new B();
   ob.show();
   ob.print();
   ob.display();
  }
}