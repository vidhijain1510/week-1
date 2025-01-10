import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input the month and day
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the day of the month (1-31): ");
        int day = scanner.nextInt();
        
        // Checking if the input is a valid Spring Season date
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
