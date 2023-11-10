import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {" ", "Rock", "Paper", "Scissors"};
        int computer = (int) Math.round(Math.random() * 2) + 1;
        System.out.println("Welcome to rock-paper-scissors game.");
        System.out.println("Type 1 for rock, 2 for paper and 3 for scissors.");
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        sc.close();
        System.out.printf("You chose:\n%s\nAnd Computer chose:\n%s\n", rps[player], rps[computer]);
        if (player == computer) {
            System.out.println("It's a draw");
        } else if ((player == 1 && computer == 2) || (player == 2 && computer == 3) && (player == 3 && computer == 1)) {
            System.out.println("You Win!!");
        } else {
            System.out.println("You Lose!");
        }
    }
}
