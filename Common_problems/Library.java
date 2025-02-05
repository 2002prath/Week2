public class Library { 
    private String author; 
    private String title; 
    private double price; 
    private boolean availability= true; 
      
    Library(String writer ,String heading, double price)
    { 
        this.author = writer; 
        this.title = heading; 
        this.price = price; 
    }
      boolean check()
    { 
        if(availability)
         { 
             availability = false; 
             System.out.println("Book borrowed successfully"); 
         }
         else
           { 
               System.out.println("Book is already booked");  
           } 
        return availability; 
    }  
    void summary()
    { 
        System.out.println("name of a book :"+ title); 
        System.out.println("writer name of a book :"+ author); 
        System.out.println("Price of a book :"+ price); 
    }
    
    
    public static void main(String[] args) 
    {
       Library l1 = new Library("Premchand","Premchandra ka fata juta",210); 
        l1.check();
        l1.summary(); 
    }
}
