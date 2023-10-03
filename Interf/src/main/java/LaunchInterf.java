interface Calc{
    void mul();
    void div();
}

abstract class Mcalc implements Calc{
    @Override
    public void mul(){
        System.out.println("multiply");
    }
}

class Acalc implements Calc{
    public void mul(){
        System.out.println("multiply");
    }
    public void div(){
        System.out.println("division");
    }
}
public class LaunchInterf {
    public static void main(String[] args) {
        Calc c = new Acalc();
        c.div();
        c.mul();
    }
}
