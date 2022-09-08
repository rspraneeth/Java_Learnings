import java.util.Scanner;

public class UserDefinedException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        if (age > 18){
            throw new InvalidAgeException("Age should be less than or equal to 18");
        }
        else System.out.println("You can enter");
    }
}

class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg){
        System.err.println(msg);
    }
}
