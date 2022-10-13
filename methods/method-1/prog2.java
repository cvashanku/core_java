class prog2
{
 int add(int a,int b)
 {
   int c=a+b;
   return c;
 }
 public static void main(String[] args)
{
 int x=new prog2().add(12,18);
 System.out.println(x);
 prog2 d=new prog2();
 int y=d.add(15,25);
 System.out.println(y);
}
}