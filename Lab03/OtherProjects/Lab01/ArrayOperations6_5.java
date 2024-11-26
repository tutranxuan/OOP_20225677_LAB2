
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] array = enterArrayOrUseConstant(scanner);


        Arrays.sort(array);


        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / array.length;


        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);

        scanner.close();
    }

    public static int[] enterArrayOrUseConstant(Scanner scanner) {
        System.out.println("Enter the array manually or use constant array? (manual/constant): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("manual")) {
            return enterArray(scanner);
        } else if (choice.equalsIgnoreCase("constant")) {
            int[] constantArray = {1789, 2035, 1899, 1456, 2013}; // Example constant array
            return constantArray;
        } else {
            System.out.println("Invalid choice. Using constant array by default.");
            int[] constantArray = {1789, 2035, 1899, 1456, 2013}; // Example constant array
            return constantArray;
        }
    }

    public static int[] enterArray(Scanner scanner) {
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
