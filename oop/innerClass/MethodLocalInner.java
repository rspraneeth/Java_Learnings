package innerClass;

class OuterC{
    void OuterMethod(){
        System.out.println("In outer method class");
        final int a = 5;
        class InnerC{
            void InnerMethod(){
                System.out.println("In inner method class, which is in outer method "+a);
            }
        }
        InnerC in = new InnerC();
        in.InnerMethod();
    }
}

public class MethodLocalInner {
    public static void main(String[] args) {
        OuterC x = new OuterC();
        x.OuterMethod();
    }
}
