package BLL.Services;

import java.util.ArrayList;

public interface IShoppingCartService {
    void addProduct(Product product, int quantity);
    void removeProduct(int productId);
    ArrayList<CartItem> getProducts();
    void clearCart();
    double calculateTotal();
}
