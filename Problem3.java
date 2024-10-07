import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a 3-digit number:\n> ");
        int number = scanner.nextInt();
        scanner.nextLine();

        // Get digits from number
        int onesDigit = number % 10;
        int tensDigit = number % 100 / 10;
        int hundredsDigit = number % 1000 / 100;

        System.out.println("The reverse of " + number + " is " + onesDigit + tensDigit + hundredsDigit);

        scanner.close();
    }
}