class prog3
{
 int cube(int a)
 {
  int c=a*a*a;
  return c;
 }
 public static void main(String[] args)
 {
   int x=new prog3().cube(8);
   System.out.println(x);
   prog3 d=new prog3();
   int y=d.cube(5);
   System.out.println(y);
 }
}