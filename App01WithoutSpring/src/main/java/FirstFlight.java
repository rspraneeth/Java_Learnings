public class FirstFlight implements DeliveryService{

    @Override
    public boolean courierService(double amount) {
        System.out.println("Courier delivered through first flight and amount paid is "+amount);
        return true;
    }
}
