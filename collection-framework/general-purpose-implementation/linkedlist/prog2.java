//program to demonstrate LinkedList  adding elements by using index values

import java.util.LinkedList;

class Demo
{
  public static void main(String args[])
   {
      LinkedList<Integer> ll=new LinkedList<>();
      ll.add(38);
      ll.add(83);
      ll.add(1,89);
      System.out.println(ll);
   }
}