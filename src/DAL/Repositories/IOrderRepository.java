package DAL.Repositories;

import DAL.Models.Order;

public interface IOrderRepository {

    public void addOrder(Order order);
    public Order getOrder(int id);
    public void updateOrder(Order order);
    public void deleteOrder(int id);

}
