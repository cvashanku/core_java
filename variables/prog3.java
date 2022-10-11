class prog3
{
static int y=20;
public static void main(String[] args)
{
System.out.println(y);
System.out.println(prog3.y);
System.out.println(new prog3().y);
prog3 d=new prog3();
System.out.println(d.y);
}
}
