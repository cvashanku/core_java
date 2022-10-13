class prog4
{ 
 int addElements(int[] a)
 { 
  int total=0;
  for(int b:a)
  {
   total=total+b;
  }
  return total;
 }
 public static void main(String[] args)
 {
  int[] i={1,2,3,4,5};
  prog4 d=new prog4();
  int x=d.addElements(i);
  System.out.println(x);
 }
}