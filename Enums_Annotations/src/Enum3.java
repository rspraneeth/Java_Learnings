enum Result1{

    PASS, FAIL, NR;
}

public class Enum3 {
    public static void main(String[] args) {
        Result1 res = Result1.NR;
        switch (res){
            case PASS : System.out.println("Pass");
            break;
            case FAIL : System.out.println("Fail");
            break;
            case NR : System.out.println("No Result");
        }
    }
}
