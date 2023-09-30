public class Employee extends Person{

    private String title;
    private double salary;

    public Employee(String firstName, String lastName, int age, String title, double salary) {
        super(firstName, lastName, age);
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
