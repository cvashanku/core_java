//program to demonstrate encapsulation
class emp
{
 private int age;
 void setAge(int age)
 {
  if(age<18)
     this.age=18;
    else if(age>60)
       this.age=60;
     else
       this.age=age;
  }
   int getAge()
   {
    return age;
   }
}
class demo
{
 public static void main(String args[])
 {
  emp e=new emp();
  e.setAge(10);
  int x=e.getAge();
  System.out.println(x);
 }
}