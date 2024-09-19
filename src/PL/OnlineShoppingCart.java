package PL;

import BLL.Services.SystemService;
import DAL.Models.ShippingDetails;
import DAL.Models.User;

import java.util.Scanner;

public class OnlineShoppingCart {
    private static final SystemService systemService = SystemService.getInstance();

    public static void viewCatalog() {
        systemService.viewCatalog();
    }

    private static String InputAddress() {
        System.out.println("Enter your address: ");
        return new Scanner(System.in).nextLine();
    }

    private static String inputCity() {
        System.out.println("Enter your city: ");
        return new Scanner(System.in).nextLine();
    }

    private static String inputCountry() {
        System.out.println("Enter your state: ");
        return new Scanner(System.in).nextLine();
    }

    private static ShippingDetails getShippingDetails() {
        return new ShippingDetails(InputAddress(), inputCity(), inputCountry());
    }





    public static void placeOrder(User user) {
        System.out.println("Dear " + user.getName() + " we are processing your order");
        System.out.println("Can you enter the shipping details for the order?");
        systemService.placeOrder(user, getShippingDetails());

    }


}
