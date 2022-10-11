class prog5
{
int x=10;
static int y=20;
public static void main(String[] args)
{
prog5 d1=new prog5();
prog5 d2=new prog5();
d1.x=d1.x+2;
d1.y=d1.y+2;
System.out.println(d1.x);
System.out.println(d1.y);
System.out.println(d2.x);
System.out.println(d2.y);
}
}