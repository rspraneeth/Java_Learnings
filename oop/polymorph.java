// illustrating run time polymorphism.
// dividing the methods to 3 categories for understanding purpose.
// I - methods exclusive to parent(only available to parent)
// II - methods exclusive to parent
// III - Overridden methods
class Bicycle1 {
    public int gear;
    public int speed;
    public Bicycle1(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void speedLow(int speedDec){  // I
        speed -= speedDec;
    }
    public void speedInc(int speedUp){  // I
        speed += speedUp;
    }
    public String printInfo(){  // III
        return ("No of gears "+gear+" Speed is "+speed);
    }
}

class MountainBike1 extends Bicycle1 {
    public int seatHeight;
    public MountainBike1(int gear, int speed, int height) {
        super(gear, speed);
        this.seatHeight = height;
    }
    public void setSeatHeight(int height){  // II
        seatHeight = height;
    }
    @Override
    public String printInfo(){  // III
        return (super.printInfo()+" height is "+seatHeight);
    }
}

public class polymorph {
    public static void main(String[] args) {
//        MountainBike1 obj = new Bicycle1(3, 100); // generates incompatible type error, bicycle1 can't be converted to mountainbike1
//        MountainBike1 obj = new MountainBike1(3, 100, 14);  // I, II, overridden III
//         Bicycle1 obj = new MountainBike1(3, 100, 15);  // I, overridden III
         Bicycle1 obj = new Bicycle1(4, 110);  // I, original III
        obj.speedInc(10);  // I
        obj.speedLow(20);  // I
//        obj.setSeatHeight(13);  // II
        System.out.println(obj.printInfo());  // III
    }
}

