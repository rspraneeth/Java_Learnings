import java.util.Scanner;

class Guesser{
    int guessNum;

    int guessingNum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Guess a number!!!...between 0 to 10:");
        guessNum = in.nextInt();
        return guessNum;
    }

}

class Player{
    int guessNum;

    int guessingNum(){
        Scanner in = new Scanner(System.in);
        System.out.println(this.getClass().getName()+" Guess a number!!!...:");
        guessNum = in.nextInt();
        return guessNum;
    }

}

class Umpire{
    int numFromGuesser;
    int numFromP1;
    int numFromP2;
    int numFromP3;
    boolean tied = true;

    void collectNumFromGuesser(){
        Guesser guesser = new Guesser();
        numFromGuesser = guesser.guessingNum();
    }

    void collectNumFromPlayers(){
        Player p1 = new Player();
        numFromP1 = p1.guessingNum();
        Player p2 = new Player();
        numFromP2 = p2.guessingNum();
        Player p3 = new Player();
        numFromP3 = p3.guessingNum();
    }

    void compare(){

        if (numFromGuesser == numFromP1){
            if (numFromGuesser == numFromP2 && numFromGuesser == numFromP3) System.out.println("Match tied!!!");
            else if (numFromGuesser == numFromP2) System.out.println("Game tied between Player 2 and Player 1");
            else if (numFromGuesser == numFromP3) System.out.println("Game tied between Player 3 and Player 1");
            else{
                System.out.println("Player 1 won!");
                tied = false;
            }
        }
        else if (numFromGuesser == numFromP2) {
            if (numFromGuesser == numFromP3) System.out.println("Game tied between Player 2 and Player 3");
            else {
                System.out.println("Player 2 won!");
                tied = false;
            }
        }
        else if (numFromGuesser == numFromP3) {
            System.out.println("Player 3 won!");
            tied = false;
        }
        else {
            System.out.println("Lost! Play again");
            tied = true;
        }


    }
}

public class LaunchGuessingGame {
    public static void main(String[] args) {
        boolean repeat = true;
        do {
            Umpire umpire = new Umpire();
            umpire.collectNumFromGuesser();
            umpire.collectNumFromPlayers();
            umpire.compare();
            repeat = umpire.tied;

        } while (repeat);

    }

}
