package innerClass;
class Demo{
    void devs(){
        System.out.println("in helper class demo");
    }
}
public class AnonymousClassSubclass {
    static Demo d = new Demo(){
        @Override
        void devs(){
            super.devs();
            System.out.println("In an anonymous class");
        }
    };

    public static void main(String[] args) {
        d.devs();
    }
}
