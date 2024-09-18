package DAL.Seeds;

import DAL.Models.Category;
import DAL.Models.Product;
import DAL.Repositories.IProductRepository;

public class ProductSeed {
    private final IProductRepository productRepository;

    public ProductSeed(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public void seedData() {
        productRepository.addProduct(new Product("Laptop", "A high performance laptop", 1000.0, 10, Category.ELECTRONICS));
        productRepository.addProduct(new Product( "Smartphone", "A latest model smartphone", 500.0, 20, Category.ELECTRONICS));
        productRepository.addProduct(new Product( "Tablet", "A lightweight tablet", 300.0, 15, Category.ELECTRONICS));
        productRepository.addProduct(new Product( "Headphones", "Noise cancelling headphones", 150.0, 30, Category.ELECTRONICS));
        productRepository.addProduct(new Product( "Smartwatch", "A feature-rich smartwatch", 200.0, 25, Category.ELECTRONICS));
        productRepository.addProduct(new Product( "Fiction Book", "A gripping tale of adventure", 15.0, 50, Category.BOOKS));
        productRepository.addProduct(new Product( "Non-Fiction Book", "Learn about the world around you", 20.0, 40, Category.BOOKS));
        productRepository.addProduct(new Product("Cookbook", "Delicious recipes for every meal", 25.0, 30, Category.BOOKS));
        productRepository.addProduct(new Product("Running Shoes", "Comfortable and durable running shoes", 80.0, 20, Category.SPORTSWEAR));
        productRepository.addProduct(new Product( "Basketball", "Professional-grade basketball", 25.0, 35, Category.SPORTSWEAR));
        productRepository.addProduct(new Product( "Soccer Ball", "Official size and weight soccer ball", 30.0, 30, Category.SPORTSWEAR));
        productRepository.addProduct(new Product( "Yoga Mat", "Non-slip yoga mat", 40.0, 25, Category.SPORTSWEAR));
        productRepository.addProduct(new Product("Jacket", "Warm and stylish jacket", 120.0, 15, Category.CLOTHING));
        productRepository.addProduct(new Product( "Jeans", "Comfortable and durable jeans", 60.0, 25, Category.CLOTHING));
        productRepository.addProduct(new Product( "T-Shirt", "Soft and breathable t-shirt", 20.0, 50, Category.CLOTHING));
        productRepository.addProduct(new Product( "Dress", "Elegant evening dress", 150.0, 10, Category.CLOTHING));
        productRepository.addProduct(new Product("Blender", "High-speed kitchen blender", 80.0, 20, Category.HOME));
        productRepository.addProduct(new Product( "Microwave", "Compact microwave oven", 100.0, 15, Category.HOME));
        productRepository.addProduct(new Product("Vacuum Cleaner", "Powerful vacuum cleaner", 150.0, 10, Category.HOME));
        productRepository.addProduct(new Product("Air Conditioner", "Energy-efficient air conditioner", 500.0, 5, Category.HOME));
    }
}
