package java_classroom;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class birthday {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Input Date of Birth
			System.out.print("Enter your birth year (e.g., 1990): ");
			int birthYear = scanner.nextInt();

			System.out.print("Enter your birth month (1-12): ");
			int birthMonth = scanner.nextInt();

			System.out.print("Enter your birth day (1-31): ");
			int birthDay = scanner.nextInt();

			// Get the current year
			int currentYear = LocalDate.now().getYear();

			// Create a LocalDate object for the birthday this year
			LocalDate birthdayThisYear = LocalDate.of(currentYear, birthMonth, birthDay);

			// Find out the day of the week
			DayOfWeek dayOfWeek = birthdayThisYear.getDayOfWeek();

			// Output the day of the week
			System.out.println("Your birthday falls on a " + dayOfWeek + " this year.");
		}
    }
	

}
