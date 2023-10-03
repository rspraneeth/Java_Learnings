interface Calculator1{
    void add(int num1, int num2);
    void sub(int num1, int num2);
    void disp();
}

interface Calculator2{
    void mul(int num1, int num2);
    void div(int num1, int num2);
    void disp();
}

class MyCalc1 implements Calculator1, Calculator2{


    public void add(int num1, int num2) {
        System.out.println("addition");
    }


    public void sub(int num1, int num2) {
        System.out.println("subtraction");
    }


    public void mul(int num1, int num2) {
        System.out.println("multiply");
    }


    public void div(int num1, int num2) {
        System.out.println("division");
    }

    public void disp(){
        System.out.println("Display");
    }
}

public class LaunchInterf1 {
    public static void main(String[] args) {
        MyCalc1 mc = new MyCalc1();
        mc.add(1, 2);
        mc.sub(1, 2);
        mc.mul(1, 2);
        mc.div(1, 2);
        mc.disp();
    }
}
