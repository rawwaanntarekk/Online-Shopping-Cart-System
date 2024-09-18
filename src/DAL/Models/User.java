package DAL.Models;

import PL.OnlineShoppingCart;

public class User {
    private static int id = 0;
    String name;
    String email;
    String address;
    String phoneNumber;


    public User(String name, String email, String address, String phoneNumber) {
        id++;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void viewCatalog() {
        OnlineShoppingCart.viewCatalog();
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
