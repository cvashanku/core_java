//program to demonstrate HashSet

import java.util.HashSet;

class Demo
{
  public static void main(String args[])
    {
       HashSet<Integer> hs=new HashSet<>();
       hs.add(34);
       hs.add(83);
       hs.add(45);
       hs.add(99);
       hs.add(49);
       System.out.println(hs);
    }
}