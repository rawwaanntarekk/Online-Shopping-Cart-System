package DAL.Models;

import BLL.Services.IOrderService;
import BLL.Services.OrderService;
import BLL.Services.ShoppingCartService;
import PL.OnlineShoppingCart;

import java.util.ArrayList;
import java.util.Collection;

public class User {
    private static int idCounter = 0;
    private final int id;
    String name;
    String email;
    String address;
    String phoneNumber;
    ShoppingCart shoppingCart;
    Collection<Order> orders;


    public User(String name, String email, String address, String phoneNumber) {
        this.id = ++idCounter;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        orders = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Order> getOrders() {
        return (ArrayList<Order>) orders;
    }

    public void viewCatalog() {
        OnlineShoppingCart.viewCatalog();
    }

    public void addToCart(Product product, int quantity) {
        ShoppingCartService.getInstance().addToCart(product, quantity);
    }



    public void placeOrder() {

        OnlineShoppingCart.placeOrder(this);
    }



    @Override
    public String toString() {
        return "User" + id +
                " name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'';
    }
}
