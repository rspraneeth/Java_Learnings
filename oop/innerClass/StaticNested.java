package innerClass;
class Outercl{
    private static void methodOfOuter(){
        System.out.println("Outer class method static");
    }
    static int c = 9;

    static class Innercl{
        void sho(){
            System.out.println("Inner static class method "+c);
            methodOfOuter();
        }
    }
}
public class StaticNested {
    public static void main(String[] args) {
        Outercl.Innercl ob = new Outercl.Innercl();
        ob.sho();
    }
}
