//programe to check whether the given number is palindrome or not
import java.util.*;
class prog2
{
 public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   System.out.print("enter any number:");
   int n=s.nextInt();
   int d,temp=n,rev=0;
   while(n>0)
   {
    d=n%10;
    rev=rev*10+d;
    n=n/10;
   }
   if(rev==temp)
    System.out.println("given number is palindrome");
   else
    System.out.println("given number is not a palindreome");
 }
}