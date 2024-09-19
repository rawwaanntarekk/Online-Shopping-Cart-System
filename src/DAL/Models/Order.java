package DAL.Models;

import java.util.Collection;

public class Order {

    private static int idCounter = 0;
    private final int id;
    private Collection<OrderItem> items;
    private OrderSummary orderSummary;
    public Order(Collection<OrderItem> items) {
        this.id = ++idCounter;
        this.items = items;

    }

    public int getId() {
        return id;
    }

    public Collection<OrderItem> getItems() {
        return items;
    }

    public void setOrderSummary(OrderSummary orderSummary) {
        this.orderSummary = orderSummary;
    }

    public OrderSummary getOrderSummary() {
        return orderSummary;
    }

    @Override
    public String toString() {
        return "\nOrder#" + id +
                "\n--- items=" + items +
                "\n--- orderSummary=" + orderSummary ;
    }
}
