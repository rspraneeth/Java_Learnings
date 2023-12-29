import java.util.Date;

//Target class
public class GreetingsGenerator {
    private Date date;


    public GreetingsGenerator(){
        System.out.println("Greetings generator instantiated");
    }

    public String GenerateGreetings(String name){
        int hr = date.getHours();
        if (hr<12) return "Good Morning ,"+name;
        else if (hr < 16) return "Good Afternoon ,"+name;
        else if (hr < 20) return "Good Evening ,"+name;
        else return "Good Night ,"+name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "GreetingsGenerator{" +
                "date=" + date +
                '}';
    }
}
