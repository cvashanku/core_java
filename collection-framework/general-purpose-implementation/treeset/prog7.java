//Let's see an example of traversing elements in descending order.

import java.util.*;  
class Demo
{  
  public static void main(String args[])
   {  
     TreeSet<String> set=new TreeSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay");  
         System.out.println("before traversing the elements" +set);
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }             
    }  
}  