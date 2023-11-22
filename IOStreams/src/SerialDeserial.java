import java.io.*;

class Employe implements Serializable{
    private int id;
    private String name;
    private int age;

    public Employe(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}');
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

public class SerialDeserial {
    public static void main(String[] args) {
//        Employe e1 = new Employe(1, "Praneeth", 26);
        Employe e2 = new Employe(2, "Satya", 32);
//        Employe e3 = new Employe(1, "RSP", 21);
//        e1.display();
        try {

//            FileOutputStream fos = new FileOutputStream("C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(e1); //stores data in form of bytes, to secure data, serialization.
//            oos.close();


//            FileInputStream fis = new FileInputStream("C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Employe e = (Employe) ois.readObject();
//            e.display();


//            FileOutputStream fos = new FileOutputStream("C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt");
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            ObjectOutputStream oos = new ObjectOutputStream(bos);
//            oos.writeObject(e2);
//            oos.close();
//            bos.close();

            FileInputStream fis = new FileInputStream("C:\\Users\\Praneeth\\IdeaProjects\\JavaBasics\\IOStreams\\abcd.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Employe e = (Employe) ois.readObject();
            e.display();

            ois.close();
            bis.close();



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
