import BLL.Services.SystemService;
import DAL.Models.User;
import PL.OnlineShoppingCart;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe","wh@gmaol.com","1234 Main St","1234567890");
        user.addToCart(SystemService.getInstance().productRepository.getProducts().stream().toList().get(0), 1);
        user.addToCart(SystemService.getInstance().productRepository.getProducts().stream().toList().get(1), 2);
        user.placeOrder();
    }
}