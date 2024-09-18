package DAL.Repositories;

import DAL.Models.Product;

import java.util.Collection;

public interface IProductRepository {

    Collection<Product> getProducts();
    Product getProductById(int id);
    void addProduct(Product product);

}
