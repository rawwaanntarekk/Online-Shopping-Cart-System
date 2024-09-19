package BLL.Services;

import DAL.Models.CartItem;
import DAL.Models.Product;

import java.util.ArrayList;

public interface IShoppingCartService {
    void addToCart(Product product, int quantity);

    void removeProduct(Product product);

    ArrayList<CartItem> getProducts();
    void clearCart();
    double calculateTotal();
}
