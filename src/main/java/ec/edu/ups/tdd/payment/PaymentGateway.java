package ec.edu.ups.tdd.payment;

public interface PaymentGateway {
    public  PaymentReponse requestPayment(PaymentRequest paymentRequest);
}
