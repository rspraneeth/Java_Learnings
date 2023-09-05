public class SalariedEmployee extends Employee{
    private double weekSalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weekSalary) {
        super(firstName, lastName, socialSecurityNumber);

        if(weekSalary<0.0) throw new IllegalArgumentException("Weekly salary must be >= 0");
        this.weekSalary = weekSalary;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        if(weekSalary<0.0) throw new IllegalArgumentException("Weekly salary must be >= 0");
        this.weekSalary = weekSalary;
    }

    @Override
    public double earnings(){return getWeekSalary();}

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%n%s: $%, .2f", super.toString(), "weekly salary", getWeekSalary());
    }
}
