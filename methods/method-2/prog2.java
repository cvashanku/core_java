class prog2
{
 void addElements(int[] a)
{
 int total=0;
 for(int b:a)
{
 total=total+b;
}
 System.out.println(total);
}
 public static void main(String[] args)
{
 int[] x={1,2,3,4,5};
 new prog2().addElements(x);
 prog2 d=new prog2();
 d.addElements(x);
}
}