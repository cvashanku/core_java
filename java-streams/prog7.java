//program to demonstrate object Streams
//              or
//program to demonstrate serialization

import java.io.*;

class emp implements Serializable
{
 int empno=101;
 float salary=5000.00f;
}
class demo
{
 public static void main(String args[])
  {
    try{
       emp e=new emp();
       FileOutputStream fos=new FileOutputStream("emp.txt");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       oos.writeObject(e);
       oos.close();
       fos.close();
       FileInputStream fis=new FileInputStream("emp.txt");
       ObjectInputStream ois=new ObjectInputStream(fis);
       emp e2=(emp)ois.readObject();
       System.out.println(e2.empno+"\t"+e2.salary);
       ois.close();
       fis.close();
     }catch(Exception e)
      {
        System.err.println(e);
      }
  }
}