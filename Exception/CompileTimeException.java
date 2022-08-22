import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CompileTimeException {


    //the code below throws CompileTImeException-FileNotFoundException. Error is thrown while compiling the file
//    public static void main(String[] args){
//        Scanner in = new Scanner(new File("file.txt"));
//        System.out.println("Executed");
//    }


    // we try to catch the exception now.
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("file.txt")); //file couldn't be found as path is wrong or file doesn't exist
            //Scanner in = new Scanner(new File("JavaBasics\\Exception\\file.txt")); // correct path or file exists
            System.out.println("File found successfully, so no exception occurred and this line is executed");
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found exception caught, we are in catch block");
        }
        finally {
            System.out.println("We are in finally block, this block runs regardless of state of exception");
        }
        System.out.println("Done with try-catch-finally and out of those blocks...");
    }

}