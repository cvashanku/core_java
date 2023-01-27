//program to demonstrate removing  elements from a collection

 
import java.util.*;
 
class Demo
{
    public static void main(String[] args)
    {
        Collection<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        System.out.println("Initial set1: "+ set1);
        set1.remove(4);
        System.out.println("set1 after removing 4 : " + set1);
       
        Collection<Integer> set2 = new HashSet<Integer>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println("Collection Elements to be removed: "+ set2);
        set1.removeAll(set2);

        System.out.println("set 1 after removeAll() operation: "+ set1);
    }
} 