//program to demonstrate adding elements to the collection

import java.util.*;
 
class Demo
{
    public static void main(String[] args)
    {
        Collection<Integer> list1 = new ArrayList<Integer>(5);
 
        list1.add(15);
        list1.add(20);
        list1.add(25);

        for (Integer number:list1) 
         {
            System.out.println(number);
         }
 
        Collection<Integer> list2 = new ArrayList<Integer>();
 
        // Appending the collection to the list
        list2.addAll(list1);
 
        System.out.println("The new ArrayList is: "+ list2);
    }
}