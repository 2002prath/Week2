package Access_modifier;

public class Library {
    public static void main(String[] mmg)
    { 
       Book non_fiction = new Book("1122-0677-6767","Rich Dad Poor Dad","Robert kiosaki"); 
       non_fiction.display();  
       
       E_book fiction = new E_book("1213-4557-7875","Space Theory","Stephen Hawkings",43.2); 
        fiction.display(); 
    }
}
class Book
{ 
   public String ISBN; 
   protected String title; 
   private String author; 

   public void setAuthor(String author) {
       this.author = author;
   }
   Book(String ISBN,String title,String author)
   { 
    this.ISBN = ISBN; 
    this.title = title; 
    this.author = author; 
   } 
   public String getAuthor() {
       return author;
   }

   protected void display()
   { 
     System.out.println("International standard book number of a book :"+ ISBN); 
     System.out.println("Title of a book "+title); 
     System.out.println("Author of a book :"+author); 
   }

}
class E_book extends Book{ 
    protected double file_size;  

    E_book(String ISBN,String title,String author,double file_size)
    { 
        super(ISBN,title,author); 
        this.file_size =file_size; 
    }

    public void display()
    { 
        System.out.println("International standard book number of a book :"+ ISBN); 
        System.out.println("Title of a book "+title); 
      //  System.out.println("Author of a book :"+author); 
        System.out.println("Size of a e-book file:"+file_size+"MB"); 
    }
}

