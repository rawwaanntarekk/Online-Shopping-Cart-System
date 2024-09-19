package DAL.Repositories;

import DAL.Models.Order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderRepository implements IOrderRepository {

    static IOrderRepository  orderRepository = null;

    private OrderRepository() {

    }

    public static OrderRepository getInstance() {
      return orderRepository == null? new OrderRepository() : (OrderRepository) orderRepository;
    }

    Collection<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(int id) {
        if (orders.size() > 0) {
            for (Order order : orders) {
                if (order.getId() == id) {
                    return order;
                }
            }
        }
        return null;
    }

    public void updateOrder(Order order) {
        Order old = getOrder(order.getId());
        if (old != null) {
            orders.remove(old);
            orders.add(order);
        }
    }

    public void deleteOrder(int id) {
        Order order = getOrder(id);
        if (order != null) {
            orders.remove(order);
        }

    }
}
