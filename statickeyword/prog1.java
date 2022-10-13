class prog1
{
 static void display()
{
 System.out.println("welcome");
}
 public static void main(String[] args)
{
 display();
 prog1.display();
 new prog1().display();
 prog1 d=new prog1();
 d.display();
}
}