package BLL.Services;

import DAL.Models.Order;
import DAL.Models.ShippingDetails;
import DAL.Models.User;

public interface IOrderService {
    public void placeOrder(User user , ShippingDetails details);

    public Order getRecentOrder(User user);
}
