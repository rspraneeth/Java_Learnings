package Polymorphism;

public class Bicycle {
    int gear;
    int speed;
    int cadence;
    Bicycle(int cadence, int speed, int gear)
    {
        this.cadence = cadence;
        this.gear = gear;
        this. speed = speed;
    }
    public void applyBreak(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }
    public void printDescription()
    {
        System.out.println("\nBike is "+ "in gear" + this.gear +
                "with a cadence of"+ this.cadence +
                " and travelling at a speed of" + this.speed+".");
    }
}
