class prog4
{ 
 void display()
{
 System.out.println("welcome");
}
 void show()
{
 display();
}
 public static void main(String[] args)
{
 new prog4().display();
 new prog4().show();
 prog4 d=new prog4();
 d.show();
}
}