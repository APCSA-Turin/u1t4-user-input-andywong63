import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Player 1 Name:\n> ");
        String player1Name = scanner.nextLine();
        System.out.print(player1Name + ", choose your number:\n> ");
        double player1Num = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Player 2 Name:\n> ");
        String player2Name = scanner.nextLine();
        System.out.print(player2Name + ", choose your number:\n> ");
        double player2Num = scanner.nextDouble();
        scanner.nextLine();

        if (player1Num > player2Num) {
            System.out.println(player1Name + "'s number is bigger!");
        } else if (player2Num > player1Num) {
            System.out.println(player2Name + "'s number is bigger!");
        } else {
            System.out.println(player1Name + " and " + player2Name + "'s numbers are the same!");
        }

        scanner.close();
    }
}
