import java.util.*; 
public class Pustakalaya {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     System.out.println("Enter name of a library"); 
     Library.Library_name = sc.nextLine();    
      
     Library library1 = new Library(); 
     
     Book book1 = new Book("Deep work","Cal Newport"); 
     Book book2 = new Book("Rich Dad Poor Dad","Robert kiosaki"); 
     Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald"); 

     library1.addBook(book1);
     library1.addBook(book2); 
     library1.addBook(book3); 
     
     
     sc.close(); 
    }
}
class Library
{ 
   public  static String Library_name; 
   public ArrayList<Book> books;  
    
   public Library()
   { 
     this.books = new ArrayList<>(); 
   } 
   public void addBook(Book book)
   { 
      books.add(book); 
   } 

   public void displaylibrary()
   { 
    for (int i = 0; i < books.size(); i++) {
        Book book = books.get(i); // Get the book at index i
        book.display();
    }
    
   }

}
class Book
{  
    public String author; 
    public String title; 
 
     public Book(String heading,String writer)
    { 
      this.title = heading; 
      this.author = writer;  
    }
    public void display()
    { 
      System.out.println("Book name "+title); 
      System.out.println("Writer of a book "+author); 
    }    
}
