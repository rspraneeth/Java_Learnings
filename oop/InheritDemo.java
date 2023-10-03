class Demo1{
    int a=10;
    void disp(){
        System.out.println(a);
    }
}

class Demo2 extends Demo1{
    int a;
    void disp(){
        a=20;
        System.out.println(a);
        System.out.println(super.a);
        super.disp();
    }
}
public class InheritDemo {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.disp();
    }
}
