import java.util.Scanner;

public class Arr2d {
    public static void main(String[] args) {
        int [][]ar = new int[3][4];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.println("Enter the marks of class "+i+", Student "+j);
                ar[i][j] = in.nextInt();
            }
        }

        System.out.println("Marks stored are: ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print("Class"+i+": ");
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
