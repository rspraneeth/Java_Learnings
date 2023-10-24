import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String repeat;
        QuizService service = new QuizService();
        QList qList = new QList();
        do {
            System.out.println("Would you like to add questions or play quiz? \nEnter '1' to add question or '2' to play quiz: ");
            int inp = in.nextInt();
            if (inp == 1) {
//                System.out.println("How many questions would you like to add?");
//                int n = in.nextInt();
                qList.addQuestion();
            } else if (inp == 2) {
                System.out.println("Please enter num of questions, and should be less than "+qList.getSize());
                int count = in.nextInt();
                System.out.println("You are about to play!");
                service.playQuiz(count);
                System.out.println("Your score is: "+service.getScore());
            }

            System.out.println("Would you like to repeat? y/n?");
            repeat = in.next();
        } while (repeat.equalsIgnoreCase("y"));
    }
}
