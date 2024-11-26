

import java.util.Scanner;

public class EquationSolver2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the type of equation you want to solve:");
        System.out.println("1. First degree equation of one variable (ax + b = 0)");
        System.out.println("2. First-degree equations of two variables (a11x1 + a12x2 = b1, a21x1 + a22x2 = b2)");
        System.out.println("3. Quadratic equation in one variable (ax^2 + bx + c = 0)");
        System.out.print("Enter your selection (1, 2 or 3): ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveLinearSystem(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid selection. Please select 1, 2 or 3.");
        }

        System.exit(0);
    }

    public static void solveLinearEquation(Scanner scanner) {
        System.out.println("Enter coefficients for a first-degree equation of one variable (ax + b = 0):");
        System.out.print("Enter a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a != 0) {
            double x = -b / a;
            System.out.println("Solution of first degree equation: x = " + x);
        } else {
            System.out.println("Invalid input. 'a' cannot be 0 for a first-order equation.");
        }
    }

    public static void solveLinearSystem(Scanner scanner) {
        System.out.println("Enter coefficients for a system of first-degree equations in two variables (a11x1 + a12x2 = b1, a21x1 + a22x2 = b2):");
        System.out.print("Enter a11: ");
        double a11 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter a12: ");
        double a12 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b1: ");
        double b1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter a21: ");
        double a21 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter a22: ");
        double a22 = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b2: ");
        double b2 = Double.parseDouble(scanner.nextLine());

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Solution of the system of equations: x1 = " + x1 + ", x2 = " + x2);
        } else {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system of equations has infinitely many solutions..");
            } else {
                System.out.println("The system of equations has no solution..");
            }
        }
    }

    public static void solveQuadraticEquation(Scanner scanner) {
        System.out.println("Enter coefficients for a quadratic equation of one variable (ax^2 + bx + c = 0):");
        System.out.print("Enter a: ");
        double quadA = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter b: ");
        double quadB = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter c: ");
        double quadC = Double.parseDouble(scanner.nextLine());

        double discriminant = quadB * quadB - 4 * quadA * quadC;

        if (quadA != 0) {
            if (discriminant > 0) {
                double root1 = (-quadB + Math.sqrt(discriminant)) / (2 * quadA);
                double root2 = (-quadB - Math.sqrt(discriminant)) / (2 * quadA);
                System.out.println("The solution of the equation is: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -quadB / (2 * quadA);
                System.out.println("The double solution of the equation is: " + root);
            } else {
                System.out.println("The equation has no real solution..");
            }
        } else {
            System.out.println("Invalid input. 'a' cannot be 0 for quadratic equations.");
        }
    }
}
