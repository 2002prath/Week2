public class Book {
    
    public static void main(String[] mmg)
    { 
         Book_details b1 = new Book_details(); 
         b1.display("Deep Work","Cal Newport",300.15); 
    }

    
}

class Book_details
{ 
    public String title; 
    public String author; 
    public double price;
    
    public void display(String title,String author,double price)
    { 
        System.out.print("Title of book :"+ title +"\nAuthor of a book :" + author +"\nPrice of a book:"+ price); 
    }
}
