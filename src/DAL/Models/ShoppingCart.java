package DAL.Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShoppingCart {
    List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void displayCart() {
        for (CartItem item : items) {
            System.out.println(item);
        }
        System.out.println("Total: " + calculateTotal());
    }

    public Collection<CartItem> getItems() {
        return items;
    }

    public void addItem(Product product, int quantity) {
        CartItem item = findItemByProduct(product);
        if (item == null) {
            items.add(new CartItem(product, quantity));
        } else {
            item.setQuantity(item.getQuantity() + quantity);
        }
    }

    public void removeItem(Product product) {
        CartItem item = findItemByProduct(product);
        if (item != null) {
            items.remove(item);
        }
    }

    public void updateItemQuantity(Product product, int quantity) {
        CartItem item = findItemByProduct(product);
        if (item != null) {
            item.setQuantity(quantity);
        }
    }

    private CartItem findItemByProduct(Product product) {
        for (CartItem item : items) {
            if (item.getProduct().equals(product)) {
                return item;
            }
        }
        return null;
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void clearCart() {
        items.clear();
    }



}
