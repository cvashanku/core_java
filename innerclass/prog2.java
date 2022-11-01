//static member class
class outer
{
  static class inner
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
   outer.inner in=new outer.inner();
   in.show();
  }
}
