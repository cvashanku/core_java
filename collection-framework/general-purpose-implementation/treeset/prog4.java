//The values can be removed from the TreeSet using the remove() method. 
//There are various other methods that are used to remove the first value or the last value.


import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        NavigableSet<String> ts=new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");
        System.out.println("Initial TreeSet " + ts);
        ts.remove("B");
        System.out.println("After removing element " + ts);
        ts.pollFirst();
        System.out.println("After removing first " + ts);
        ts.pollLast();
        System.out.println("After removing last " + ts);
    }
}