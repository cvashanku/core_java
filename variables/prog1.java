class prog1
{
int x=30;
static int y=40;
public static void main(String[] args)
{
int z=50;
System.out.println(z);
System.out.println(y);
System.out.println(prog1.y);
prog1 d=new prog1();
System.out.println(d.x);
System.out.println(new prog1().x);
}
}