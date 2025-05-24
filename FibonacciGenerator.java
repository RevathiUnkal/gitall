import java.util.Scanner;

public class FibonacciGenerator {

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + n + ":");

        if (n >= 1) System.out.print(a);
        if (n >= 2) System.out.print(", " + b);

        int next = a + b;
        while (next <= n) {
            System.out.print(", " + next);
            a = b;
            b = next;
            next = a + b;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number;

        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input argument. Using default value 20.");
                number = 20;
            }
        } else {
            // If no CLI arg, ask user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number to generate Fibonacci series: ");
            if(scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Using default value 20.");
                number = 20;
            }
            scanner.close();
        }

        generateFibonacci(number);
    }
}

