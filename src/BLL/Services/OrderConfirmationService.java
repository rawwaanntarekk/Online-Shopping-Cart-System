package BLL.Services;

import DAL.Models.Order;
import DAL.Models.User;

public class OrderConfirmationService implements IOrderConfirmationService{

    static IOrderConfirmationService orderConfirmationService = null;

    private OrderConfirmationService() {

    }

    public static OrderConfirmationService getInstance() {
        return orderConfirmationService == null? new OrderConfirmationService() : (OrderConfirmationService) orderConfirmationService;
    }
    @Override
    public void sendConfirmation(User user){
        Order recentOrder = user.getOrders().get(user.getOrders().size() - 1);
        System.out.println("Order Confirmation: ");
        System.out.println(("Order Details: " + recentOrder.toString()));
    }
}
