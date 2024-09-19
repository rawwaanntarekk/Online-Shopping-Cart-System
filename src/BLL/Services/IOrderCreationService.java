package BLL.Services;

import DAL.Models.Order;
import DAL.Models.OrderItem;

import java.util.Collection;

public interface IOrderCreationService {



    public Order createOrder(Collection<OrderItem> items);
}
