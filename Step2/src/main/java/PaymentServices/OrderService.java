package PaymentServices;

public interface OrderService {
    public void onSiteOrderRegister(String customerName);

    public void onlineOrderRegister(String customerName);

    void phoneOrderRegister(String customerName);

    public void onSiteOrderPayment(int foodPrice);

    public void onlineOrderPayment(int foodPrice);


    void phoneOrderPayment(int foodPrice);

}
