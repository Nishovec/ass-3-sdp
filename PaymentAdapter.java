public class PaymentAdapter implements PaymentService {
    private PaymentGateway paymentGateway;

    public PaymentAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    @Override
    public boolean makePayment(double amount) {
        return paymentGateway.processPayment(amount);
    }
}
