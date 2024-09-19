package DAL.Models;

import BLL.Services.ShoppingCartService;

public class Product {
    // ID counter for product instances
    private static int idCounter = 0;

    // Product attributes
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantityInStock;
    private Category category;

    /**
     * Constructor for Product class with validation checks.
     *
     * @param name             the name of the product
     * @param description      the description of the product
     * @param price            the price of the product (should be non-negative)
     * @param quantityInStock  the quantity of product in stock (should be non-negative)
     * @param category         the category of the product
     */
    public Product(String name, String description, double price, int quantityInStock, Category category) {
        this.id = ++idCounter; // Unique product ID
        this.name = name;
        this.description = description;
        
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
        
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Quantity in stock cannot be negative");
        }
        this.quantityInStock = quantityInStock;

        
        this.category = category;
    }

    // Getters and Setters for encapsulation
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock < 0) {
            throw new IllegalArgumentException("Quantity in stock cannot be negative");
        }
        this.quantityInStock = quantityInStock;
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
