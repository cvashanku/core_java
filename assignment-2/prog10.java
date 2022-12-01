import java.util.*;
class sumofdigit
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("enter any number:");
  int n=s.nextInt();
  int d=0,sum=0;
  while(n!=0)
  {
    d=n%10;
    sum=sum+d;
    n=n/10;
  }
   System.out.println(sum);
 }
}