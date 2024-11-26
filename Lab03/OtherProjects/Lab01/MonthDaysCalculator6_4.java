

import java.util.Scanner;

public class MonthDaysCalculator6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {"January", "February", "March", "April", "May", "June", 
                "July", "August", "September", "October", "November", "December",
                "Jan.", "Feb.", "Mar.", "Apr.", "May", "June", 
                "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.",
                "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec",
                "1", "2", "3", "4", "5", "6", 
                "7", "8", "9", "10", "11", "12"};
        
        while (true) {
            System.out.println("Enter a month (e.g., January, Jan., Jan, 1): ");
            String inputMonth = scanner.nextLine();
            int monthIndex = -1;

            for (int i = 0; i < months.length; i++) {
                if (months[i].equals(inputMonth) ) {
                	monthIndex = i % 12;;
                    break;
                }
            }

            if (monthIndex == -1) {
                System.out.println("Invalid month. Please enter a valid month.");
                continue;
            }

            System.out.println("Enter a year: ");
            int year = scanner.nextInt();

            if (year < 0) {
                System.out.println("Invalid year. Please enter a non-negative year.");
                continue;
            }

            int daysInMonth = getDaysInMonth(monthIndex, year);
            if (daysInMonth == -1) {
                System.out.println("Invalid input. Please try again.");
            } else {
                System.out.println("Number of days in " + months[monthIndex] + " " + year + ": " + daysInMonth);
                break;
            }
        }

        scanner.close();
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 0 || month > 11) {
            return -1;
        }

        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month];
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
