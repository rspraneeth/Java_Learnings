public class Person {
    private String name;
    public Person(String n) throws InvalidDataException{
        if (null==n || "".equals(n)) throw new InvalidDataException();
        name=n;
    }

    @Override
    public String toString() {
        return name;
    }

}
