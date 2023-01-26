//program to demonstrate ignoring duplcate elements

import java.util.*;
class Demo
{
   public static void main(String args[])
     {
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        lhs.add("siva");
        lhs.add("shankara");
        lhs.add("vara");
        lhs.add("shankara");
        Iterator<String> i=lhs.iterator();
        while(i.hasNext())
          {
            System.out.println(i.next());
          }
     }
}