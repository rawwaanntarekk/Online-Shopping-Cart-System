package BLL.Services;

import DAL.Models.Product;
import DAL.Repositories.IProductRepository;
import DAL.Repositories.ProductRepository;
import DAL.Seeds.ProductSeed;

public class SystemService {
    private static SystemService instance;
    private final IProductRepository productRepository;


    private SystemService() {
        productRepository = new ProductRepository();
        ProductSeed dataSeeder = new ProductSeed(productRepository);
        dataSeeder.seedData();
    }

    public static SystemService getInstance() {
            if(instance == null) {
            instance = new SystemService();
        }
        return instance;
    }


    public void viewCatalog() {
        System.out.println("Catalog: ");
        for(Product product : productRepository.getProducts()) {
            System.out.println(product);
        }
    }


}


