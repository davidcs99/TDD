package ec.edu.ups.tdd.payment;

public class PaymentProcessor {

    private PaymentGateway gateway;

    public PaymentProcessor(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public boolean makePayment(double amount){
        PaymentReponse response = gateway.requestPayment(new PaymentRequest(amount));
        if (response.getStatus()== PaymentReponse.PaymentStatus.OK)
            return true;
        else
            return false;
    }
}
