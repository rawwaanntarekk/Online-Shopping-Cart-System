package BLL.Services;

import DAL.Models.Order;
import DAL.Models.OrderItem;
import DAL.Models.OrderSummary;
import DAL.Models.ShippingDetails;

public class OrderSummaryService implements IOrderSummaryService{
    private static final IOrderSummaryService orderSummaryService = null;

    private OrderSummaryService() {

    }

    public static OrderSummaryService getInstance() {
      return orderSummaryService == null? new OrderSummaryService() : (OrderSummaryService) orderSummaryService;
    }

    private double calculateTotal(Order order){
        double total = 0;
        for(OrderItem item : order.getItems()){
            total += item.getSubtotal();
        }
        return total;
    }


    @Override
    public OrderSummary getOrderSummary(Order order , ShippingDetails details){
        return new OrderSummary(calculateTotal(order),details);

    }
}
