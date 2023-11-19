import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Human1{
    public void eat(){
        System.out.println("Human is eating");
    }
}

class Man extends Human1{
    public void eat(){
        System.out.println("Man is eating");
    }
}

class Student{
    public void eat(){
        System.out.println("Student is eating");
    }
}

public class GenericsWildCard {
    public static void main(String[] args) {
        ArrayList<Human1> humans = new ArrayList<>();
        ArrayList<Man> men = new ArrayList<>();
//        humans = men; // error
//        men = humans; // error

        Human1 h = new Human1();
        Man m = new Man();
//        h = m; //possible
//        m = h; // cast error

        ArrayList<?> humans1 = new ArrayList<>(); //? is wildcard or unknown type
        ArrayList<Man> men1 = new ArrayList<>();
        humans1 = men1; // possible because of wild card

        ArrayList<? extends Human1> humanList1 = new ArrayList<>(); //upper bound, any type which extends human type or same human type
        ArrayList<Man> manList1 = new ArrayList<>();
        ArrayList<Student> studentList1 = new ArrayList<>();

        humanList1 = manList1; // since manList1 is of Man type, it is possible to assign it to humanList1
//        humanList1 = studentList1; //Compiler error, since studentList1 is not of Human type, it is not possible to assign it to humanList1

        ArrayList<Object> objs = new ArrayList<>();
//        humanList1 = objs; // Compiler error, because humans2 are not humans type, they are objs type, upper bound is only Human type not more than that.

        ArrayList<? super Human1> humanList2 = new ArrayList<>(); //lower bound, any type which is super type of Human type or same Human type
        ArrayList<Object> objs1 = new ArrayList<>();
        ArrayList<Man> manList2 = new ArrayList<>();
        ArrayList<Human1> humans2 = new ArrayList<>();
        humanList2 = humans2;
        humanList2 = objs1;
//        humanList2 = manList2; // since manList2 is of Human type, it is not possible to assign it to humanList2, we can only assign super type of Human

        humans2.add(new Human1());
        humans2.add(new Human1());
        invokeEat(humans2);

        manList2.add(new Man());
        manList2.add(new Man());
        invokeEat(manList2);

    }

    public static void invokeEat(List<? extends Human1> list){
        for(Human1 h : list){
            h.eat();
        }
    }
}
