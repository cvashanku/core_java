import java.util.*;
class display
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("enter any number:");
  int n=s.nextInt();
  int sum=0;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
      sum=sum+i;
  }
  System.out.println(sum);
 }
}