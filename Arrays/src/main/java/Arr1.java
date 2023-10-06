import java.util.Scanner;

public class Arr1 {
    public static void main(String[] args) {
        int []ar = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks of students: ");
        for (int a = 0; a < ar.length; a++) {
            ar[a] = in.nextInt();
        }

        for (int i: ar) {
            System.out.print(i+" ");
        }
    }
}
