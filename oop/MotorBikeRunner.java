public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(120);

        ducati.start();
        honda.start();

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

        ducati.setSpeed(-10);
        honda.setSpeed(20);

        ducati.newSpeedInc(30);
        honda.newSpeedInc(-10);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
    }
}
