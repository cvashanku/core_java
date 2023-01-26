//program to demonstrate linkedhashset

import java.util.LinkedHashSet;

class Demo
{
  public static void main(String args[])
    {
       LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
       lhs.add(34);
       lhs.add(83);
       lhs.add(45);
       lhs.add(99);
       lhs.add(49);
       System.out.println(lhs);
    }
}