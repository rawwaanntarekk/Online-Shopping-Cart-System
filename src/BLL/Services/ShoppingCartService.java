package BLL.Services;

import java.util.ArrayList;

public class ShoppingCartService implements IShoppingCartService {
    private ShoppingCart cart = new ShoppingCart();

    @Override
    public void addProduct(Product product, int quantity) {
        cart.addProduct(product, quantity);
    }

    @Override
    public void removeProduct(int productId) {
        cart.removeProduct(productId);
    }

    @Override
    public ArrayList<CartItem> getProducts() {
        return cart.getProducts();
    }

    @Override
    public void clearCart() {
        cart.clearCart();
    }

    @Override
    public double calculateTotal() {
        return cart.calculateTotal();
    }
}
