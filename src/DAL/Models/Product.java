package DAL.Models;

public class Product {
    static int id = 0;
    String name;
    String description;
    double price;
    int quantityInStock;
    Category category;

    public Product(String name, String description, double price, int quantityInStock, Category category) {
        id++;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.category = category;
    }


}
