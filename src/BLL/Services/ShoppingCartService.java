package BLL.Services;

import DAL.Models.CartItem;
import DAL.Models.Product;
import DAL.Models.ShoppingCart;

import java.util.ArrayList;

public class ShoppingCartService implements IShoppingCartService {
    private static ShoppingCartService instance;
    private final ShoppingCart cart;

    private ShoppingCartService() {
        cart = new ShoppingCart();
    }

    public static ShoppingCartService getInstance() {
        if(instance == null) {
            instance = new ShoppingCartService();
        }
        return instance;
    }


    @Override
    public void addToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    @Override
    public void removeProduct(Product product) {
        cart.removeItem(product);
    }

    @Override
    public ArrayList<CartItem> getProducts() {
        return (ArrayList<CartItem>) cart.getItems();
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
