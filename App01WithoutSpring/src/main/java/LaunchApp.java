public class LaunchApp {
    public static void main(String[] args) {
        Amazon a;
        a = new Amazon();
        //a.setService(new FedEx()); //setter injection
        //a.setService(new FirstFlight());
        a.setService(new BlueDart());
        System.out.println(a.initiateDelivery(12.2));

    }
}
