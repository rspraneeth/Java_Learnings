import java.util.List;
import java.util.Scanner;

public class QuizService {
    int score=0;
    Scanner in = new Scanner(System.in);

    public void playQuiz(int count){
        List<Question> questions = QList.getQuestions(count);
        System.out.println("Get Set Go!!!");
        for (Question q: questions) {
            System.out.println(q.getTitle()+"\n"+q.getOption1()+" "+q.getOption2()+" "+q.getOption3()+" "+q.getOption4()+"\nYour answer: ");
            String ans = in.nextLine();
            if (ans.equals(q.getAnswer())) score++;
            else score--;
        }

    }

    public int getScore(){
        return score;
    }
}
