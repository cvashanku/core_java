class prog2
{ 
 int[] getElements()
{
 int[] a={1,2,3,4,5};
 return a;
}
 public static void main(String[] args)
{
 prog2 d=new prog2();
 int[] x=d.getElements();
 for(int y:x)
{
 System.out.println(y);
}
}
}