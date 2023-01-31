//program to demonstrate sample example of treeset

import java.util.*;  
class Demo
{  
  public static void main(String args[])
   {    
    TreeSet<String> al=new TreeSet<String>();  
    al.add("Ravi");  
    al.add("Vijay");  
    al.add("Ravi");  
    al.add("Ajay");   
    //Traversing elements  
    Iterator<String> itr=al.iterator();  
    while(itr.hasNext())
     {  
      System.out.println(itr.next());  
     }  
   }  
}  