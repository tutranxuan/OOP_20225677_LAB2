
import java.util.Scanner;

public class MatrixAddition6_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int[][] matrix1 = enterMatrix(scanner, "first");
        int[][] matrix2 = enterMatrix(scanner, "second");

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices don't have the same dimensions for addition.");
        } else {
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            System.out.println("Result of Matrix Addition:");
            displayMatrix(resultMatrix);
        }

        scanner.close();
    }

    public static int[][] enterMatrix(Scanner scanner, String matrixName) {
        System.out.println("Enter the number of rows for the " + matrixName + " matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the " + matrixName + " matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the " + matrixName + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}