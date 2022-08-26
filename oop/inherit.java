class Bicycle{
    public int gear;
    public int speed;
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void speedLow(int speedDec){
        speed -= speedDec;
    }
    public void speedInc(int speedUp){
        speed += speedUp;
    }
    public String printInfo(){
        return ("No of gears "+gear+" Speed is "+speed);
    }
}

class MountainBike extends Bicycle1 {
    public int seatHeight;
    public MountainBike(int gear, int speed, int height) {
        super(gear, speed);
        this.seatHeight = height;
    }
    public void setSeatHeight(int height){
        seatHeight = height;
    }
    @Override
    public String printInfo(){
        return (super.printInfo()+" height is "+seatHeight);
    }
}

public class inherit {
    public static void main(String[] args) {
        MountainBike1 mb = new MountainBike1(5, 120, 120);
        System.out.println(mb.printInfo()+"\n");
        mb.setSeatHeight(130);
        System.out.println(mb.printInfo()+"\n");
        mb.speedInc(20);
        System.out.println(mb.printInfo()+"\n");
        mb.speedLow(40);
        System.out.println(mb.printInfo()+"\n");
    }
}
