//instance variable assigning with method
class Emp
{
 int empNo;
 float salary;
 void set(int a,float b)
  {
   empNo=a;
   salary=b;
  }
}
class Demo
{
  public static void main(String args[])
  {
   Emp e1=new Emp();
   Emp e2=new Emp();
   e1.set(101,5000.00f);
   e2.set(102,6000.00f);
   System.out.println(e1.empNo+" "+e1.salary);
   System.out.println(e2.empNo+" "+e2.salary);
  }
}