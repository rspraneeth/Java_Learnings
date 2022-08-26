public class encaps {
    public static void main(String[] args) {
        Student s = new Student();
        s.setGPA(22.1f);
        System.out.println(s.getGPA());
        s.name = "RSP";
        System.out.println(s.name);
        Student.setStuds(33);
        System.out.println(Student.getStuds());
    }
}

class Student{
    //fields
    String name;
    private float GPA;
    private static int studs;
    public float getGPA(){
        return GPA;
    }
    public void setGPA(float newGPA){
        this.GPA = newGPA;
    }

    public static int getStuds(){
        return studs;
    }

    public static void setStuds(int newStuds){
        Student.studs = newStuds;
    }
}
