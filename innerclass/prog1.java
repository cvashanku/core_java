//member class
class outer
{
  class inner
  {
    void show()
    {
     System.out.println("welcome");
    }
  }
}
class demo
{
 public static void main(String args[])
 {
   outer out=new outer();
   outer.inner in=out.new inner();
   in.show();
 }
}