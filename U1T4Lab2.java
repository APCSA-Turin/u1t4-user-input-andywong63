import java.util.Scanner;

public class U1T4Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize number
        System.out.print("Enter a number:\n> ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Current number: " + number);

        // Addition
        System.out.print("Enter a number to add to the current number:\n> ");
        int addNumber = scanner.nextInt();
        scanner.nextLine();
        number += addNumber;
        System.out.println("Current number: " + number);

        // Subtraction
        System.out.print("Enter a number to subtract from the current number:\n> ");
        int subtractNumber = scanner.nextInt();
        scanner.nextLine();
        number -= subtractNumber;
        System.out.println("Current number: " + number);

        // Multiplication
        System.out.print("Enter a number to multiply to the current number:\n> ");
        int multiplyNumber = scanner.nextInt();
        scanner.nextLine();
        number *= multiplyNumber;
        System.out.println("Current number: " + number);

        // Division
        System.out.print("Enter a number to divide from the current number:\n> ");
        int divideNumber = scanner.nextInt();
        scanner.nextLine();
        number /= divideNumber;
        System.out.println("Current number: " + number);

        // Increment/decrement
        System.out.print("Would you like to increment, decrement, or do nothing to the number? (Type +, -, or nothing)\n> ");
        String operation = scanner.nextLine();
        if (operation.equals("+")) {
            number++;
        } else if (operation.equals("-")) {
            number--;
        }
        System.out.println("Current number: " + number);

        // Even or odd
        number %= 2;
        if (number == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }

        scanner.close();
    }
}