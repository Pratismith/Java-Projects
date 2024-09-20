package java_classroom;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Age_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for birthdate
        System.out.println("Enter your birthdate (YYYY-MM-DD):");
        String birthDateInput = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(birthDateInput);
        
        // Prompt the user for the target date
        System.out.println("Enter the date on which you want to calculate the age (YYYY-MM-DD):");
        String targetDateInput = sc.nextLine();
        LocalDate targetDate = LocalDate.parse(targetDateInput);
        
        // Calculate the age
        Period age = Period.between(birthDate, targetDate);
        
        // Display the result
        System.out.println("Your age on " + targetDate + " is: " 
            + age.getYears() + " years, " 
            + age.getMonths() + " months, and " 
            + age.getDays() + " days.");
        
        sc.close();
    }
}
