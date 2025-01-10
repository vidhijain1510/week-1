import java.util.Scanner;

public class Handshakes{
    public static void main(String[] args) {
		int numberOfStudents, handshakes;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        numberOfStudents = input.nextInt();
		handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
		input.close();
    }
}