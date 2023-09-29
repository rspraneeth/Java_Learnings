package src.main.java;

import java.util.Scanner;

public class Validate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = in.nextLine();
        System.out.println("Enter last name:");
        String lastName = in.nextLine();
        System.out.println("Enter address:");
        String address = in.nextLine();
        System.out.println("Enter city:");
        String city = in.nextLine();
        System.out.println("Enter state:");
        String state = in.nextLine();
        System.out.println("Enter zip:");
        String zip = in.nextLine();
        System.out.println("Enter phone:");
        String phone = in.nextLine();
        System.out.printf("%nValidate Result:");

        if (!ValidateInput.validateFirstName(firstName)) System.out.println("Invalid First Name.");
        else if (!ValidateInput.validateLastName(lastName)) System.out.println("Invalid Last Name.");
        else if (!ValidateInput.validateAddress(address)) System.out.println("Invalid Address.");
        else if (!ValidateInput.validateCity(city)) System.out.println("Invalid city.");
        else if (!ValidateInput.validateState(state)) System.out.println("Invalid state.");
        else if (!ValidateInput.validateZip(zip)) System.out.println("Invalid zip.");
        else if (!ValidateInput.validatePhone(phone)) System.out.println("Invalid Phone.");
        else System.out.println("Valid Input.");
    }
}
