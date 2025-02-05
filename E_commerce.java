import java.util.ArrayList;
import java.util.List;


class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Product: " + productName + ", Price: $" + price);
    }
}

// Order class
class Order {
    private int orderId;
    private List<Product> products; // Aggregation: Order contains multiple products
    private double totalAmount;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public int getOrderId() {
        return orderId;
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
        totalAmount += product.getPrice(); // Update the total amount
    }

    // Display details of the order
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product product : products) {
            product.displayDetails();
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}

// Customer class
class Customer {
    private String name;
    private List<Order> orders; // Association: Customer places multiple orders

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Display all orders placed by the customer
    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        System.out.println("Orders placed:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Main class for demonstration
public class E_commerce {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        
        Customer customer = new Customer("John Doe");

        
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        
        Order order2 = new Order(102);
        order2.addProduct(product3);

        
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        
        customer.displayCustomerOrders();
    }
}

