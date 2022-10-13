class Emp
{
 int empNo;
 float salary;
 Emp(int empNo,float salary)
 {
  this.empNo=empNo;
  this.salary=salary;
 }
}
class demo
{
 public static void main(String[] args)
 {
  Emp e1=new Emp(101,5000.00f);
  Emp e2=new Emp(102,6000.00f);
  System.out.println(e1.empNo+"\t"+e1.salary);
  System.out.println(e2.empNo+"\t"+e2.salary);
 }
}