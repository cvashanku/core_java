import java.util.*;
class prime
{
 public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   System.out.print("enter any number:");
   int n=s.nextInt();
   int count=0;
   for(int i=1;i<=n;i++)
   {
     if(n%i==0)
      count++;
   }
   if(count==2)
     System.out.println("given number is prime number");
   else
     System.out.println("given number is not a prime number");
 }
}