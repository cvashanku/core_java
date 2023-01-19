//insertion and deletion operation required shuffling of data 

import java.util.ArrayList;

class Demo
{
  public static void main(String args[])
    {
       ArrayList<Integer> al=new ArrayList<>();
       al.add(43);
       al.add(90);
       al.add(0,99);
       for(int x:al)
         System.out.println(x);
    }
}