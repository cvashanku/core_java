//program to demonstrate ArrayList in heterogeneous elements

import java.util.*;

class Demo
{
  public static void main(String args[])
    {
       ArrayList al=new ArrayList();
       al.add(23);
       al.add(47);
       al.add(74);
       al.add(83.4f);
       al.add("hello");
       System.out.println(al);
    }
}