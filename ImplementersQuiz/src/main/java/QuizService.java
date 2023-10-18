import java.util.Scanner;

public class QuizService {
    int score=0;
    Scanner in = new Scanner(System.in);

    public void playQuiz(){
        int count = Question.numQ;
        if (count < 3) System.out.println("You have only "+count+" questions!!! Please add more questions to play.");
        else {
            System.out.println("Get Set Go!!!");

        }

//        for (Question q: questions) {
//            System.out.println(q.getTitle()+"\n"+q.getOption1()+" "+q.getOption2()+" "+q.getOption3()+" "+q.getOption4()+"\nYour answer: ");
//            String ans = in.next();
//
//            if (ans.equals(q.getAnswer())) score++;
//            else score--;
//        }
    }

    public int getScore(){
        return score;
    }
}
