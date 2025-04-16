public class Product {
    // Attributes
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    // Main method to test the Product class
    public static void main(String[] args) {
        // Example input
        Product product = new Product(101, "Laptop", 75000);
        product.displayDetails();
    }
}
