class prog3
{  
 int x=10;
 void show()
{
 int x=20;
 System.out.println(x);
 System.out.println(this.x);
}
 public static void main(String[] args)
{
 prog3 d=new prog3();
 d.show();
}
}