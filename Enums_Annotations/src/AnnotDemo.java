@FunctionalInterface
interface Add{
    void add();
//    void add(int a);

    default int add(int a, int b) {
        return a+b;
    }
}

class Aeroplane{
    void fly(){
        System.out.println("Flying");
    }
}


class FighterPlane extends Aeroplane{
    //Overriding method to see different behaviour at run time
    @Override // using this annotation to check if the method is overridden or not for compiler
    void fly() {
        System.out.println("Flying with jet");
    }
}

public class AnnotDemo {
    public static void main(String[] args) {
        Add a = () -> System.out.println("Addition");
        FighterPlane fp = new FighterPlane();
        fp.fly();
    }
}
