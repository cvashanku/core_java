class prog1
{
int max(int a, int b)
{
 if(a>b)
    return a;
  else
  return b;
}
public static void main(String[] args)
{
 int x=new prog1().max(83,43);
 System.out.println(x);
 prog1 d=new prog1();
 int y=d.max(23,42);
 System.out.println(y);
}
}