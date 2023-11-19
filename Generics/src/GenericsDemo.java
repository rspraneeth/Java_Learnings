interface IGen<T>{
    void disp();

}

class Human{
    public void sleep(){
        System.out.println("Humans needs to sleep");
    }
}
class Genr<T> implements IGen<String>{
    T ref;

    public  Genr(T ref){
        this.ref = ref;
    }

//    public  Genr(){
//    }

    public  void disp(){
        System.out.println("The type passed to generic<T> : "+ref.getClass().getName());
    }

    public T getRef() {
        return ref;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Genr<Integer> genr = new Genr<>(11);
        Genr<String> genr1 = new Genr<>("String object text");
//        Genr gen = new Genr(22); // Without ' <> ' gives warning
        genr.disp();
        System.out.println(genr.getRef());
        genr1.disp();
        System.out.println(genr1.getRef());

        Genr<Human> genr2 = new Genr<>(new Human());
        genr2.disp();
        System.out.println(genr2.getRef());

        IGen<String> g = new Genr<>("Java Data");
        g.disp();
    }
}
