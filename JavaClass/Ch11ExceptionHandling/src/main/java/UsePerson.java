public class UsePerson {
    public static void main(String[] args) {
        Person p = null;
        String name = null;
        name = "Praneeth";
        try{
            p = new Person(name);
        }catch (InvalidDataException e){
            System.err.println(e.getMessage());
        }
        if (p!=null) System.out.println("We got a person created, "+name);
    }
}
