package innerClass;
class Outer{
    static class Inner{
        public void show(){
            System.out.println("In the inner class");
        }
    }
}
public class NestedInner {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.show();
    }
}
