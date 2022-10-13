class demo
{
 demo()
 {
  System.out.println("welcome");
 }
 demo(int x)
{
 this();
 System.out.println(x);
}
public static void main(String[] args)
{
 new demo(5);
}
}