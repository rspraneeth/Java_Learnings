import java.util.Date;

public class LaunchApp {
    public static void main(String[] args) {
        GreetingsGenerator gg = new GreetingsGenerator();
        System.out.println("Target object before injecting dependent object/setter injection "+gg);
        Date date = new Date();
        System.out.println("Dependent obj -> "+date);
        gg.setDate(date); //setter injection
        System.out.println("Target object after injecting dependent object -> "+gg);
        System.out.println(gg.GenerateGreetings("Praneeth"));
    }
}
