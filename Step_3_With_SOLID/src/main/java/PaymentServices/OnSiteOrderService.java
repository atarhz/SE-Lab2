package PaymentServices;

public class OnSiteOrderService implements OrderService {

    @Override
    public void orderRegister(String customerName) {
        System.out.println("on-site order registered for " + customerName);
    }


    @Override
    public void orderPayment(int foodPrice) {
        System.out.println("online Payment with Price : " + foodPrice + " Tomans!");
    }

}
