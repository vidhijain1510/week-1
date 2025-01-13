import java.util.Scanner;

public class ZaraBonus {
    public static void main(String[] args) {

        // To take input from the user
        Scanner input = new Scanner(System.in);

        // Arrays to store salary, years of service, new salary, and bonus
        double[][] employeeData = new double[10][2]; // salary, years of service
        double[][] bonusData = new double[10][2]; // new salary, bonus

        // Store total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            // Collect salary
            while (true) {
                System.out.print("Salary: ");
                employeeData[i][0] = input.nextDouble();
                if (employeeData[i][0] < 0) {
                    System.err.println("Invalid number! Salary cannot be negative. Please enter again.");
                } else {
                    break; // Exit the loop when valid salary is entered
                }
            }

            // Collect years of service
            while (true) {
                System.out.print("Years of service: ");
                employeeData[i][1] = input.nextDouble();
                if (employeeData[i][1] < 0) {
                    System.err.println("Invalid number! Years of service cannot be negative. Please enter again.");
                } else {
                    break; // Exit the loop when valid years of service is entered
                }
            }
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            double bonus;
            if (employeeData[i][1] > 5) {
                bonus = employeeData[i][0] * 0.05; // 5% bonus
            } else {
                bonus = employeeData[i][0] * 0.02; // 2% bonus
            }

            bonusData[i][0] = employeeData[i][0] + bonus; // new salary
            bonusData[i][1] = bonus; // bonus

            totalBonus += bonus;
            totalOldSalary += employeeData[i][0];
            totalNewSalary += bonusData[i][0];
        }

        // Displaying the results
        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
        System.out.println();

        // Display employee details
        System.out.println("Employee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + employeeData[i][0]);
            System.out.println("Years of Service: " + employeeData[i][1]);
            System.out.println("Bonus: " + bonusData[i][1]);
            System.out.println("New Salary: " + bonusData[i][0]);
            System.out.println();
        }

        input.close();
    }
}
