public class BookRunner {
    public static void main(String[] args) {
        Book artOfProgramming = new Book(10);
        Book effectiveJava = new Book(20);
        Book cleanCode = new Book(30);
        System.out.println(artOfProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());
        artOfProgramming.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(200);
        cleanCode.setNoOfCopies(300);
        System.out.println(artOfProgramming.getNoOfCopies());
        System.out.println(effectiveJava.getNoOfCopies());
        System.out.println(cleanCode.getNoOfCopies());
    }
}
