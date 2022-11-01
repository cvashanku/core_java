//anonymous class
interface test
{
  void show();
}
class demo
{
 public static void main(String args[])
 {
  test t=new test()
  {
   public void show()
   {
    System.out.println("welcome");
   }
  };
  t.show();
 }
}