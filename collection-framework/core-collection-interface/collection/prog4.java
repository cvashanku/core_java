//program to illustrate iterating over a Collection

import java.util.*;
 
class Demo
{ 
    public static void main(String[] args)
    {
        Collection<String> list = new LinkedList<>();
 
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("is");
        list.add("a");
        list.add("CS");
        list.add("Students");
        list.add("Portal");
 
        System.out.println("The list is: "+ list);
        Iterator<String> iter = list.iterator();

        System.out.println("\nThe iterator values" + " of list are: ");
        while (iter.hasNext())
         {
            System.out.print(iter.next()+" ");
         }
     }
}