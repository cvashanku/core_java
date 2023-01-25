//program to demonstrate clear() method in HashSet class

import java.util.HashSet;

class Demo
{
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    cars.clear();
    System.out.println(cars);
  }
}
