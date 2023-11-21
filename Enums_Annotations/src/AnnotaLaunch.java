
import java.lang.annotation.*;
import java.lang.reflect.Field;

//Annotations are created based on mechanism of interface, using @
//@Target(ElementType.TYPE)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@interface TeamName {
    String country() default "INDIA";
    int age();
}

//Meta data
@TeamName(age = 22)
class Team{
    @TeamName(country = "AUS", age = 23)
    String name;
    int numPlayers;
    public Team(){
        System.out.println("Team created");
    }

    public void setName(String name) { this.name = name; }

    public void setNumPlayers(int numPlayers) { this.numPlayers = numPlayers; }

    public String getName() { return name; }

    public int getNumPlayers() { return numPlayers; }
}

public class AnnotaLaunch {
    public static void main(String[] args) throws NoSuchFieldException {
        Team t = new Team();
        t.setName("India");
        t.setNumPlayers(11);
        System.out.println(t.getName()+": "+t.getNumPlayers());
        Class cls = t.getClass();
        Annotation an = cls.getAnnotation(TeamName.class);
        TeamName tn = (TeamName) an;
        int age = tn.age();
        System.out.println(age+" "+tn.country());
    }
}
