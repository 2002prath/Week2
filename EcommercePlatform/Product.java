package EcommercePlatform;

public abstract class Product {
    private String Id;
    private String Name;
    private double price;

    public Product(String productId,String productName,double productPrice)
    {
        this.Id = productId;
        this.Name = productName;
        this.price = productPrice;
    }

    abstract double calculateDiscount();

    public void displayDetails()
    {
        System.out.println("ID of a product :"+ Id);
        System.out.println("Name of a product :"+ Name);
        System.out.println("MRP of a product :"+ price);
    }

}
