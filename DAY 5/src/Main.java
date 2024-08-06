import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter an integer: ");
        int integerInput = scanner.nextInt();

        // Taking float input
        System.out.print("Enter a float: ");
        float floatInput = scanner.nextFloat();

        // Taking double input
        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();

        // Taking long input
        System.out.print("Enter a long: ");
        long longInput = scanner.nextLong();

        // Taking boolean input
        System.out.print("Enter a boolean: ");
        boolean booleanInput = scanner.nextBoolean();

        // Consume the remaining newline character
        scanner.nextLine();

        // Taking string input
        System.out.print("Enter a string: ");
        String stringInput = scanner.nextLine();

        // Displaying the input values
        System.out.println("You entered the following values:");
        System.out.println("Integer: " + integerInput);
        System.out.println("Float: " + floatInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Long: " + longInput);
        System.out.println("Boolean: " + booleanInput);
        System.out.println("String: " + stringInput);

        // Close the scanner
        scanner.close();
    }
}
