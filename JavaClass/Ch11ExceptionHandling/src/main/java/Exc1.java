public class Exc1 {
    public static void main(String[] args) {
        try {
            System.out.println("In try block");
            throw new Exc1ClassExc();
        }catch (Exc1ClassExc e){
            e.getMessage();
            e.printStackTrace();
        }finally {
            System.out.println("In finally.");
        }
    }
}
