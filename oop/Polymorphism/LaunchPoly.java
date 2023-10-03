package Polymorphism;
// one thing present in many forms, multiple behaviour, 1:many,

class Flight{
    public void takeOff(){
        System.out.println("Flight is taking off.");
    }

    void fly(){
        System.out.println("Flight is flying.");
    }
}

class CargoFlight extends Flight{
    public void takeOff(){
        System.out.println("Cargo flight requires longer runway to takeoff.");
    }

    void fly(){
        System.out.println("Cargo flight flies at lower height.");
    }
}

class PassengerFlight extends Flight{
    public void takeOff(){
        System.out.println("Passenger flight requires medium runway to takeoff.");
    }

    void fly(){
        System.out.println("Passenger flight flies at medium height.");
    }
}

class FighterFlight extends Flight{
    public void takeOff(){
        System.out.println("Fighter flight requires short runway to takeoff.");
    }

    void fly(){
        System.out.println("Fighter flight flies at high height.");
    }
}

public class LaunchPoly {
    public static void main(String[] args) {
        CargoFlight cf = new CargoFlight();
        PassengerFlight pf = new PassengerFlight();
        FighterFlight ff = new FighterFlight();
        Flight f;
        f=cf;
        f.takeOff();
        f.fly();
        System.out.println();
        f=pf;
        f.takeOff();
        f.fly();
        System.out.println();
        f=ff;
        f.takeOff();
        f.fly();
        System.out.println();

    }
}
