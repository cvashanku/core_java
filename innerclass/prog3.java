//static member class
class outer
{
 static class inner
 {
  static void show()
  {
   System.out.println("welcome");
  }
 }
}
class demo
{ 
 public static void main(String args[])
 {
    outer.inner.show();
 }
}