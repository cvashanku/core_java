//program to count the no.of words in a given string

import java.util.*;
class demo
{
  public static void main(String args[])
  {
    String s="welcome to java";
    StringTokenizer st=new StringTokenizer(s);
    int n=st.countTokens();
    System.out.println(n);
  }
} 