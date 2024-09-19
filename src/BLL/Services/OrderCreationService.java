package BLL.Services;

import DAL.Models.Order;
import DAL.Models.OrderItem;

import java.util.Collection;

public class OrderCreationService implements IOrderCreationService{

    private static final IOrderCreationService orderCreationService = null;

    private OrderCreationService() {

    }

    public static OrderCreationService getInstance() {
      return orderCreationService == null? new OrderCreationService() : (OrderCreationService) orderCreationService;
    }


    @Override
    public Order createOrder(Collection<OrderItem> items) {
        return new Order(items);

    }
}
