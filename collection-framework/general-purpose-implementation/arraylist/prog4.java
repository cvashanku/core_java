import java.util.*;

class Emp
{
  int empNo;
  String name;
  float salary;
  Emp(int empNo,String name,float salary)
    {
      this.empNo=empNo;
      this.name=name;
      this.salary=salary;
    }
//  public String toString()
//    {
//      return empNo+" "+name+" "+salary; 
//    }
}

class Demo
{
  public static void main(String args[])
    {
ArrayList<Emp> al=new ArrayList<>();
      Emp el=new Emp(101,"aaa",5000.00f);
      Emp e2=new Emp(102,"bbb",5000.00f);
      Emp e3=new Emp(103,"ccc",5900.00f);
      
      al.add(e1);
      a1.add(e2);
      a1.add(e3);
      System.out.println(al);
    }
}