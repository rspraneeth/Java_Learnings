package Polymorphism;
// one thing present in many forms, multiple behaviour, 1:many,
//compile time - overloading
//runtime - inheritance, overriding

class Flight1{
    public void takeOff(){
        System.out.println("Flight is taking off.");
    }

    void fly(){
        System.out.println("Flight is flying.");
    }
}

class CargoFlight1 extends Flight1{
    public void takeOff(){
        System.out.println("Cargo flight requires longer runway to takeoff.");
    }

    void fly(){
        System.out.println("Cargo flight flies at lower height.");
    }
}

class PassengerFlight1 extends Flight1{
    public void takeOff(){
        System.out.println("Passenger flight requires medium runway to takeoff.");
    }

    void fly(){
        System.out.println("Passenger flight flies at medium height.");
    }
}

class FighterFlight1 extends Flight1{
    public void takeOff(){
        System.out.println("Fighter flight requires short runway to takeoff.");
    }

    void fly(){
        System.out.println("Fighter flight flies at high height.");
    }
}

class Airport{
    public void permit(Flight1 flight){
        flight.takeOff();
        flight.fly();
        System.out.println();
    }
}

public class LaunchPoly1 {
    public static void main(String[] args) {
        CargoFlight1 cf = new CargoFlight1();
        PassengerFlight1 pf = new PassengerFlight1();
        FighterFlight1 ff = new FighterFlight1();
        Airport a = new Airport();
        a.permit(cf);
        a.permit(pf);
        a.permit(ff);

    }
}
