class prog1
{
 int x=10;
 void show()
{
 System.out.println(x);
}
 public static void main(String[] args)
{
 new prog1().show();
 prog1 d=new prog1();
 d.show();
}
}