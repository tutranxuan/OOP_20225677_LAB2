
import java.util.Scanner;

public class ArithmeticOperations2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the second number: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        double diff = num1 - num2;
        System.out.println("Difference: " + diff);

        double product = num1 * num2;
        System.out.println("Product: " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        System.exit(0);
    }
}
