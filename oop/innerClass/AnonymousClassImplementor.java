package innerClass;
interface helper{
    void demo();
}

public class AnonymousClassImplementor {
    static helper h = new helper() {
        @Override
        public void demo() {
            System.out.println("Using interface");
        }
    };

    // static helper h = () -> System.out.println("Using interface");

    public static void main(String[] args) {
        h.demo();
    }
}
