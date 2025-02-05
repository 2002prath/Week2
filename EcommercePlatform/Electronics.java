package EcommercePlatform;

public class Electronics extends Product implements Taxable{
    public double tax;
    protected double price;
    protected double discount;
    public Electronics(String productId,String productName,double productPrice,double GST)
    {
        //this.price = productPrice;
        super(productId,productName,productPrice);
        this.tax = GST;
    }


    public double calculateTax()
    {
        return tax;
    }
    public double calculateDiscount()
    {   price = price + tax - discount;
        return price;
    }
    public void display()
    {
        super.displayDetails();
        System.out.println("Total tax :"+ calculateTax());
        System.out.println("Total discount :"+ calculateDiscount());
    }
}
