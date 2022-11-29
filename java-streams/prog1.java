//program to demonstrate predefined streams

import java.io.*;

class demo
{
  public static void main(String args[])
   {
     byte[] b=new byte[10];
     System.out.print("enter any number:");
     try{
     System.in.read(b);
     }catch(IOException e)
      {
         System.err.println(e);
      }
     String s1=new String(b); 
     String s2=s1.trim();
     int x=Integer.parseInt(s2);
     System.out.println(x);
   }
}