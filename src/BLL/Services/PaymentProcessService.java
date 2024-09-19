package BLL.Services;

public class PaymentProcessService implements IPaymentProcessService{

    private static final IPaymentProcessService paymentProcessService = null;

    private PaymentProcessService() {

    }

    public static PaymentProcessService getInstance() {
        return paymentProcessService == null? new PaymentProcessService() : (PaymentProcessService) paymentProcessService;
    }
    @Override
    public boolean processPayment() {

        System.out.println("Payment....");

        return true;
    }
}
