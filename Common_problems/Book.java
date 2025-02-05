import java.util.Scanner;
class Book
{ 
    public static void main(String[] mmg)
    { 
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter title of a book"); 
         String title = sc.nextLine(); 

         System.out.println("Enter name of a author"); 
         String author = sc.nextLine(); 

         System.out.println("Enter price of a book"); 
          double  price = sc.nextDouble(); 

        Title t1 = new Title(author,title,price);  
        t1.display();  
        sc.close();
    }
}
class Title
{   String author1;
    String title1; 
    double price1; 

    Title(String author,String title,double price)
    { 
        this.author1 = author;
        this.title1 = title; 
        this.price1 = price;   
    }

    void display()
    { 
        System.out.println("Author of a book "+author1);
        System.out.println("Title of a book "+title1);
        System.out.println("Price of a book "+price1); 
    }
}