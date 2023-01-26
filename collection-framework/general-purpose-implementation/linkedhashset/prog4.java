//remove elements using linkedhashset

import java.util.*;
class Demo
{
  public static void main(String args[])
   {
     LinkedHashSet<String> lhs=new LinkedHashSet<>();
     lhs.add("java");
     lhs.add("T");
     lhs.add("point");
     lhs.add("good");
     lhs.add("website");
     System.out.println(lhs);
     System.out.println(lhs.remove("good"));
     System.out.println(lhs);
     System.out.println(lhs.remove("for")); 
   }
}