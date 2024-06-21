package ec.edu.ups.tdd.payment;

public class PaymentReponse {

    enum PaymentStatus{
        OK, ERROR;
    }
    private PaymentStatus status;

    public PaymentReponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
