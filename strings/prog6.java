//program to convert string into a byte array

class demo
{
  public static void main(String args[])
   {
    String s="welcome";
    byte[] b1=s.getBytes();
    for(byte b2:b1)
     {
       System.out.println(b2);
     }
   }
}