import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean repeat;
        Question question = new Question();
        QuizService service = new QuizService();
        do {
            System.out.println("Would you like to add a question or play quiz? \nEnter '1' to add questions or '2' to play quiz: ");
            int inp = in.nextInt();
            if (inp == 1) {
                question.addQuestion(new Question());
            } else if (inp == 2) {
                System.out.println("You are about to play!");
                service.playQuiz();
            }

            System.out.println("Would you like to repeat? true or false?");
            repeat = in.nextBoolean();
        } while (repeat);
    }
}
