package DAL.Repositories;

import DAL.Models.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class ProductRepository implements IProductRepository {
    private final Collection<Product> products = new ArrayList<Product>();

    @Override
    public Collection<Product> getProducts() {
       return products;
    }

    @Override
    public Product getProductById(int id) {
        try {
            return products.stream().filter(product -> product.getId() == id).findFirst().orElseThrow(() -> new IllegalArgumentException("Product not found"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }
}
