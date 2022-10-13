class prog3
{ 
 void add(int a,int b)
{
 System.out.println(a+b);
}
void add(int a,int b,int c)
{
 System.out.println(a+b+c);
}
 public static void main(String[] args)
{
 new prog3().add(10,20);
 prog3 d=new prog3();
 d.add(12,5,87);
 d.add(100,400);
}
}