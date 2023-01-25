//program to demonstrate add() method in HashSet class

import java.util.HashSet;

class Demo {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add(" ");
    cars.add("Mazda");
    System.out.println(cars);
  }
}

/*
-->array representation of set implementation class
-->it doesnot allow duplicates because it implements set interface
-->it allows null values
-->it is called as unordered set
*/ 