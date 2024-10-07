import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name:\n> ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");
        System.out.print("Please enter the first integer:\n> ");
        int firstInt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the second integer:\n> ");
        int secondInt = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Please enter the third integer:\n> ");
        int thirdInt = scanner.nextInt();
        scanner.nextLine();

        double average = (firstInt + secondInt + thirdInt) / 3.;

        System.out.println("The average of " + firstInt + ", " + secondInt + ", and " + thirdInt + " is " + average);

        scanner.close();
    }
}