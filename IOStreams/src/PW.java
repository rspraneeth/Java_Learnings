import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PW {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(true);
        printWriter.println(14);
        printWriter.println(14.33);
        printWriter.println("Java");
        printWriter.println('S');
        printWriter.close();
    }
}
