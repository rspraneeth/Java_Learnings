import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class QList {
    static List<Question> questionsList = new ArrayList<>();
    static int numQ;
    Scanner in = new Scanner(System.in);

    public QList(){
        questionsList.add(new Question(1, "Whats 3rd planet", "moon", "sun", "earth", "nyc", "nyc"));
        questionsList.add(new Question(2, "Whats 3rd planet", "moon", "sun", "earth", "nyc", "nyc"));
        questionsList.add(new Question(3, "Whats 3rd planet", "moon", "sun", "earth", "nyc", "nyc"));
        questionsList.add(new Question(4, "Whats 3rd planet", "moon", "sun", "earth", "nyc", "nyc"));
        questionsList.add(new Question(5, "Whats 3rd planet", "moon", "sun", "earth", "nyc", "nyc"));
    }

    public static List<Question> getQuestions(int count) {
        int n = questionsList.size();
        List<Question> qs = new ArrayList<>();

        int[] rand = new int[count];
        for (int i=0; i < count; i++) { // picking random numbers, have to write code yet
            rand[i] = new Random().nextInt(1, n+1);
        }


        for (int i=0; i < count; i++) {
            qs.add(questionsList.get(rand[i]-1));
        }

        return qs;
    }

    public void addQuestion(){
        System.out.println("How many questions would you like to add?");
        numQ = questionsList.size();
        int cou = in.nextInt();
        for (int i = 0; i < cou; i++){
            Question q = new Question();
            System.out.println("Question id is " + (++numQ));
            q.setQid(numQ);
            System.out.println("Question title? :");
            q.setTitle(in.nextLine());
            System.out.println("Enter 4 options: ");
            q.setOption1(in.nextLine());
            q.setOption2(in.nextLine());
            q.setOption3(in.nextLine());
            q.setOption4(in.nextLine());
            System.out.println("Enter answer: ");
            q.setAnswer(in.nextLine());
            questionsList.add(q);
            System.out.println(q);
            System.out.println("Question added!");
        }
    }

    public void displayAllQuestions(){
        for (Question q: questionsList) {
            System.out.println(q);
        }
    }

    public int getSize() {
        return questionsList.size();
    }
}
