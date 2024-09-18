package DAL.Models;

public class Product {
    static int idCounter = 0;
    int id;
    String name;
    String description;
    double price;
    int quantityInStock;
    Category category;

    public Product(String name, String description, double price, int quantityInStock, Category category) {
        this.id = ++idCounter;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product " + id +
                ": name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                ", category=" + category +
                '}';
    }
}
