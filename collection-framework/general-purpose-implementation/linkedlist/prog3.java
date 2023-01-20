//program to demonstrate change element in a list by using set() method

import java.util.LinkedList;
  
class Demo{
  
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();
  
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "Geeks");

        System.out.println("Initial LinkedList " + ll); 
        ll.set(1, "For");  
        System.out.println("Updated LinkedList " + ll);
    }
}