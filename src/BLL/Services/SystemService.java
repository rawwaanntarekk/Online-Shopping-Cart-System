package BLL.Services;

import DAL.Models.Order;
import DAL.Models.Product;
import DAL.Models.ShippingDetails;
import DAL.Models.User;
import DAL.Repositories.IProductRepository;
import DAL.Repositories.ProductRepository;
import DAL.Seeds.ProductSeed;

public class SystemService {
    private static SystemService instance;
    public final IProductRepository productRepository;

    IOrderService orderService;


    private SystemService() {
        productRepository = new ProductRepository();
        ProductSeed dataSeeder = new ProductSeed(productRepository);
        dataSeeder.seedData();
        orderService = OrderService.getInstance();
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

    public void placeOrder(User user , ShippingDetails details) {
        orderService.placeOrder(user , details);
    }

    public Order getRecentOrder(User user) {
        return orderService.getRecentOrder(user);
    }


}


