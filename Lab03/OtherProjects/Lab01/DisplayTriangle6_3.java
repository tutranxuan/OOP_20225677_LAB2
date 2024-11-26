
import java.util.Scanner;

public class DisplayTriangle6_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the height of the triangle: ");
        int n = keyboard.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); 
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
        
        System.exit(0);
    }
}