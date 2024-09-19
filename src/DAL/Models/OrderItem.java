package DAL.Models;

public class OrderItem {
    private Product product;
    private int quantity;

    private double subtotal;
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        subtotal = this.product.getPrice() * this.quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        return subtotal;
    }

    @Override
    public String toString() {
        return "OrderItem" +
                " product=" + product +
                ", quantity=" + quantity;
    }
}
