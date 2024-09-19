package BLL.Services;

import DAL.Models.Order;
import DAL.Models.OrderItem;
import DAL.Models.ShippingDetails;
import DAL.Models.User;
import DAL.Repositories.IOrderRepository;
import DAL.Repositories.OrderRepository;

import java.util.Collection;
import java.util.stream.Collectors;

public class OrderService implements IOrderService {
    IShoppingCartService shoppingCartService ;
    IOrderCreationService orderCreationService;
    IOrderRepository orderRepository;

    IPaymentProcessService paymentProcessService;

    IOrderConfirmationService orderConfirmationService;

    static IOrderService  orderService = null;

    private OrderService() {
        this.shoppingCartService = ShoppingCartService.getInstance();
        this.orderCreationService = OrderCreationService.getInstance();
        this.orderRepository = OrderRepository.getInstance();
        this.paymentProcessService = PaymentProcessService.getInstance();
        this.orderConfirmationService = OrderConfirmationService.getInstance();
    }

    public static IOrderService getInstance() {
       return orderService == null? new OrderService() : orderService;
    }

    private Collection<OrderItem> getOrderItems() {
        return shoppingCartService.getProducts().stream()
                           .map((product) -> new OrderItem(product.getProduct(), product.getQuantity()))
                           .collect(Collectors.toList());
    }

    private void  updateQuantity(Collection<OrderItem> items) {
        items.forEach((item) -> item.getProduct().setQuantityInStock(item.getProduct().getQuantityInStock() - item.getQuantity()));
    }

    private boolean isValidPayment() {
        return paymentProcessService.processPayment();
    }


    private void addOrderToUser(User user, Order order) {
        user.getOrders().add(order);
    }

    @Override
    public Order getRecentOrder(User user) {
        return user.getOrders().get(user.getOrders().size() - 1);
    }

    @Override
    public void placeOrder(User user , ShippingDetails details) {
        // 1. Create order with the products in the cart
        Order order = orderCreationService.createOrder(getOrderItems());
        addOrderToUser(user, order);


        // 2. after making the order, remove the products from the cart.
        shoppingCartService.clearCart();

        // 3. Update the quantity of the products in the inventory
        updateQuantity(order.getItems());

        // 4. prepare ordser summary
        order.setOrderSummary(OrderSummaryService.getInstance().getOrderSummary(order, details));

        // 5. Save the order in the repository
        orderRepository.addOrder(order);

        // 6. Print the order summary
        System.out.println(order.getOrderSummary().toString());

        // 7. Payment if valid, send confirmation else send error message
        if(isValidPayment()) {
            orderConfirmationService.sendConfirmation(user);
        } else {
            System.out.println("Payment failed");
        }










    }



}
