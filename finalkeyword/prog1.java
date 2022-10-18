class prog1
{
 final int x;//error because final variable must be initialized
 public static void main(String args[])
 {
   prog1 d=new prog1();
   System.out.println(d.x);
 }
}