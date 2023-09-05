public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Praneeth", "Reddi",
                "123-456-789", 5000, 0.04, 300);

        System.out.printf("Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);
        employee.setCommissionRate(0.06);
        employee.setGrossSales(7000);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
    }
}