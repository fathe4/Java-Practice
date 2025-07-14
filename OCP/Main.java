package OCP;

public class Main {
    public static void main(String[] args){
        PaymentProcessor payment = new PaymentProcessor();
        BkashPayment bkash = new BkashPayment();
        
        payment.process(new CashPayment());
        payment.process(bkash);
    }
}
