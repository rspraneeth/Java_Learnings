import java.util.*;

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
        HashSet<Integer> set = new HashSet<>(count);
        Random random = new Random();

        while (set.size() < count){
            int number = random.nextInt(0, n);
            set.add(number);
        }

        Integer[] setAr = set.toArray(new Integer[0]);

        for (int i=0; i < count; i++) {
            qs.add(questionsList.get(setAr[i]));
        }

        return qs;
    }

    public void addQuestion(){
        System.out.println("How many questions would you like to add?");
        numQ = questionsList.size();
        int cou = in.nextInt();
        in.nextLine();
        for (int i = 0; i < cou; i++){
            Question q = new Question();
            numQ++;
            System.out.println("Question id is " + (questionsList.size()+1));
            q.setQid(questionsList.size()+1);
            System.out.println("Question title? :");
            String title = in.nextLine();
            q.setTitle(title);
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

    public int getSize() {
        return questionsList.size();
    }
}
