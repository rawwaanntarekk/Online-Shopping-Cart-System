package BLL.Services;

import DAL.Models.Order;
import DAL.Models.OrderSummary;
import DAL.Models.ShippingDetails;

public interface IOrderSummaryService {

    public OrderSummary getOrderSummary(Order order , ShippingDetails details);

}
