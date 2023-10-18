import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {
    private int qid;
    private String title;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    static int numQ;

    List<Question> questionsList = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    public void addQuestion(Question q){
        numQ++;
        System.out.println("Question id is " +questionsList.size()+1);
        q.setQid(questionsList.size()+1);
        System.out.println("Question title? :");
        String title = in.nextLine();
        q.setTitle(title);
        System.out.println("Enter option 1: ");
        String op1 = in.next();
        q.setOption1(op1);
        System.out.println("Enter option 2: ");
        String op2 = in.next();
        q.setOption2(op2);
        System.out.println("Enter option 3: ");
        String op3 = in.next();
        q.setOption3(op3);
        System.out.println("Enter option 4: ");
        String op4 = in.next();
        q.setOption4(op4);
        System.out.println("Enter answer: ");
        String ans = in.next();
        q.setAnswer(ans);
        questionsList.add(q);
        System.out.println(q);
    }

    public Question() { }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qid=" + qid +
                ", title='" + title + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                '}';
    }
}
