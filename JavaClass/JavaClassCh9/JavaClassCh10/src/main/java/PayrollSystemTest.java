public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee =
                new SalariedEmployee("Yosha", "Chundru",
                "111-111-1111", 4000);
        HourlyEmployee hourlyEmployee =
                new HourlyEmployee("Praneeth", "Reddi",
                "222-222-2222", 80, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones",
                "333-333-3333", 1000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee =
                new BasePlusCommissionEmployee("Bob", "Lewis",
                        "444-444-4444", 5000, .04, 300);
        System.out.println("Employees processed individually: ");
        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
        System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        System.out.println("Employees processed polymorphic-ally:");

        for (Employee currentEmployee: employees){
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee){
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10*employee.getBaseSalary());
                System.out.printf("New base salary with 10%% increase is $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
        }

        for (int i = 0; i < employees.length; i++){
            System.out.printf("Employee %d is a %s%n", i, employees[i].getClass().getName());
        }
    }
}
