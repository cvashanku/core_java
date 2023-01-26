import java.util.*;  
class Book 
 {  
  int id;  
  String name,author,publisher;  
  int quantity;  
  public Book(int id, String name, String author, String publisher, int quantity) 
   {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
   }  
 }  
 class Demo
   {  
     public static void main(String[] args)
      {  
        LinkedHashSet<Book> hs=new LinkedHashSet<Book>();  
     
        Book b1=new Book(101,"Muthaidhu","Narendra","Arjun",8);  
        Book b2=new Book(102,"Topi","Narendra & siva","Bosu",4);  
        Book b3=new Book(103,"Dhiva","Narendra","Siva",6);  
        //Adding Books to hash table  
        hs.add(b1);  
        hs.add(b2);  
        hs.add(b3);
    
       for(Book b:hs)
        {  
          System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);           
        }  
      }  
    }  