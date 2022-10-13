class prog2
{ 
 int x=10;
 void show()
{
 System.out.println(x);
}
 public static void main(String[] args)
{
 prog2 d1=new prog2();
 prog2 d2=new prog2();
 d1.x=d1.x+3;
 d1.show();
 d2.show();
}
}