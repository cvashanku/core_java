//Let's see a simple example of the Java LinkedHashSet class.
// Here you can notice that the elements iterate in insertion order.

import java.util.LinkedHashSet;
import java.util.Iterator;

class Demo
{
  public static void main(String args[])
    {
       LinkedHashSet<String> lhs=new LinkedHashSet<>();
       lhs.add("one");
       lhs.add("two");
       lhs.add("three");
       lhs.add("four");
       lhs.add("five");
       Iterator<String> i=lhs.iterator();
       while(i.hasNext())
        {
          System.out.println(i.next());
        }
    }
}