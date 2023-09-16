import java.util.Scanner;

public class StringRegEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String s3 = s1 +" "+s2;
        System.out.println(s3);

        StringBuilder s = new StringBuilder();
        for(int i = s3.length()-1; i >= 0; i--) {
            System.out.println(s3.charAt(i));
            s.append(s3.charAt(i));
        }
        System.out.println(s);


        System.out.println(s3.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println("Satya".equals(s1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2=="Praneeth");
        System.out.println(s3.indexOf('a')+" "+s3.substring(6));
    }
}
