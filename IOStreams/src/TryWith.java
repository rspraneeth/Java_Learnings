import java.io.*;

public class TryWith {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt")))) {
            Employe e = (Employe) ois.readObject();
            e.display();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
