//program to demonstrate iterating through the enhanced for loop

import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        Set<String> ts=new TreeSet<>();
        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");
        System.out.println(ts);
        for (String value : ts)
            System.out.print(value +", ");
    }
}