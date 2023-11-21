import java.io.*;

class Employee{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class IO {
    public static void main(String[] args) throws IOException {
        Employee e1 = new Employee(1, "Praneeth", 26);
        Employee e2 = new Employee(2, "Satya", 35);
        System.out.println(e1 + " " + e2);

        // jvm shuts down, all data is not available, so to save data in file use IO's

        String path = "C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt";
        String path2 = "C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\123";
        String path3 = "C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams";
        FileWriter fileWriter = null;
        try {
            File file = new File(path);
//            System.out.println(file.createNewFile());// if file is present it refers automatically. if not it creates
            System.out.println(file.exists());
            System.out.println(file.isFile());
            System.out.println(file.isDirectory());
            File dir = new File(path2);
            System.out.println(dir.mkdir()); // creates a directory if not exists
            System.out.println(dir.exists());
            System.out.println(dir.isFile());
            System.out.println(dir.isDirectory());
            File dir1 = new File(path3);
            String[] ar = dir1.list();
            int numFiles = 0;
            assert ar != null;
            for (String f : ar) {
                numFiles++;
                System.out.println(f);
            }
            System.out.println(numFiles);

            fileWriter = new FileWriter(file);
            fileWriter.write(e1.toString());
            fileWriter.write("\n");
            fileWriter.write(e2.toString());

        } catch (Exception e) {
            System.out.println("Some exception" + e.getMessage());
        } finally {
            assert fileWriter != null;
            fileWriter.close();
        }


    }
}
