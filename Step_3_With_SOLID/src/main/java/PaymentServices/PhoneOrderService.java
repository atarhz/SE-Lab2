package PaymentServices;

public class PhoneOrderService implements OrderService {

    @Override
    public void orderRegister(String customerName) {
        System.out.println("Phone order registered for " + customerName);
    }


    @Override
    public void orderPayment(int foodPrice) {
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }

}
