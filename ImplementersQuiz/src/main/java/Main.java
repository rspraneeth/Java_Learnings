import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean repeat;
        QuizService service = new QuizService();
        QList qList = new QList();
        do {
            System.out.println("Would you like to add a question or play quiz? \nEnter '1' to add question or '2' to play quiz: ");
            int inp = in.nextInt();
            if (inp == 1) {
                qList.addQuestion(new Question());
            } else if (inp == 2) {
                System.out.println("Please enter num of questions, and should be less than "+qList.getSize());
                int count = in.nextInt();
                System.out.println("You are about to play!");
                service.playQuiz(count);
                System.out.println("Your score is: "+service.getScore());
            }

            System.out.println("Would you like to repeat? true or false?");
            repeat = in.nextBoolean();
        } while (repeat);
    }
}
