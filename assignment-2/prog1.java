//programe to display reverse of the given number
import java.util.*;
class prog1
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("enter any number:");
    int n=s.nextInt();
    int d,rev=0;
    while(n>0)
    {
      d=n%10;
      rev=rev*10+d;
      n=n/10;
    }
    System.out.println(rev);
  }
}