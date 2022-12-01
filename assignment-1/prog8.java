import java.util.*;
class intervalofprime
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("enter starting number:");
  int n1=s.nextInt();
  System.out.print("enter starting number:");
  int n2=s.nextInt();
  for(int i=n1;i<=n2;i++)
   {
     int count=0;
     for(int j=1;j<=i;j++)
      {
        if(i%j==0)
         count++;
      }
      if(count==2)
       System.out.println(i);
   }
 }
}