//class Result extends Enum{
//
//}

enum Result{
    PASS, FAIL, NR;
    double grades;

    Result(){
        System.out.println("Constructor called");
    }

    public void setGrades(double grades){
        this.grades = grades;
    }

    public double getGrades(){
        return grades;
    }
}

public class Enum2 {
    public static void main(String[] args) {
        Result.PASS.setGrades(35.0);
        System.out.println("1---------------------");
        double grades = Result.PASS.getGrades();
        System.out.println("2---------------------");
        System.out.println(grades+" is grade for PASS");
        double grades2 = Result.FAIL.getGrades();
        System.out.println("3---------------------");
        System.out.println(grades2+" is grade for FAIL");
    }
}
