import java.io.*;

public class BufReader {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        BufferedReader br = null;
        String path = "C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt";
        try {
            File file = new File(path);
            reader = new FileReader(file);
            br = new BufferedReader(reader);

            String str = br.readLine();
            while (str!=null){
                System.out.println(str);
                str = br.readLine();
            }

        }catch (Exception e) {
            System.out.println("Some exception" + e.getMessage());
        } finally {
            reader.close();
            br.close();
        }
    }
}
