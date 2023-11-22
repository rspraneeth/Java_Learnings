class Alien implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("close method invoked");
    }
}

public class TryWithDemo {
    public static void main(String[] args) throws Exception {
        try(Alien a = new Alien()){
            System.out.println("try with block executed with alien obj in try with block");
        }
    }
}
