//program to iterate token by token in a given string

import java.util.*;

class demo
{
  public static void main(String args[])
  {
    String s="welcome to java";
    StringTokenizer st=new StringTokenizer(s);
    while(st.hasMoreTokens())
    {
      String s2=st.nextToken();
      System.out.println(s2);
    }
  }
} 