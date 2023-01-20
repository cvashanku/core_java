//program to demonstrate linkedlist 
import java.util.LinkedList;
class Demo
{
  public static void main(String args[])
    {
       LinkedList<Integer> ll=new LinkedList<>();
       ll.add(34);
       ll.add(83);
       ll.add(74);
       ll.addFirst(43);
       ll.addLast(81);
       System.out.println(ll);
    } 
}