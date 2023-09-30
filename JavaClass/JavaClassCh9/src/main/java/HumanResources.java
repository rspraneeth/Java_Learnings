public class HumanResources {
    public HumanResources(){
        Employee boss = new Employee("Doe", "Jane", 71, "Project Manager", 100000);
        Employee lead = new Employee("Dobbs", "Bob", 54,"Project Lead", 75000);
        System.out.println( boss.getName()+"'s title is " + boss.getTitle() + ".");
        if(isPastRetirement(boss)) System.out.println(boss.getName()+ " is eligible for retirement.");
        System.out.println( lead.getName() + "'s title is " + lead.getTitle() + ".");
        if (isPastRetirement(lead)) System.out.println(lead.getName() + " is eligible for retirement.");
    }

    private boolean isPastRetirement(Employee employee) {
        return employee.getAge()>65;
    }

    public static void main(String[] args) {
        new HumanResources();
    }
}
