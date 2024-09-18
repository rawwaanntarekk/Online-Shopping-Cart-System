package PL;

import BLL.Services.SystemService;

public class OnlineShoppingCart {
    private static final SystemService systemService = SystemService.getInstance();

    public static void viewCatalog() {
        systemService.viewCatalog();
    }


}
