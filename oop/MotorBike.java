public class MotorBike {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = Math.max(speed, 0);
    }

    public void newSpeedInc(int newSpeed){
        this.speed += newSpeed;
    }

    public MotorBike(int speed) {
        this.speed = speed;
    }

    void start(){
        System.out.println("Bike started");
    }
}
