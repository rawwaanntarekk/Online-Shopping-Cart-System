package DAL.Models;

public class OrderSummary {
     double total;
    ShippingDetails shippingDetails;

    public OrderSummary(double total, ShippingDetails shippingDetails) {
        this.total = total;
        this.shippingDetails = shippingDetails;

    }

    public void setShippingDetails(ShippingDetails shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    @Override
    public String toString() {
        return "OrderSummary:" +
                "\ntotal=" + total +
                "\nshippingDetails=" + shippingDetails +
                '}';
    }
}
