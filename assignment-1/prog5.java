import java.util.*;
class alldisplay
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);  
  System.out.print("enter starting number:");
  int n1=s.nextInt();
  System.out.print("enter ending number:");
  int n2=s.nextInt();
  for(int a=n1;a<=n2;a++)
  {
    int sum=0;
    for(int b=1;b<a;b++)
    {
     if(a%b==0)
     sum=sum+b;
    }
    if(sum==a)
     System.out.println(a);
  }
 }
}