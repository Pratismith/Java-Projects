package java_classroom; 

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "password123";
        int maxAttempts = 3;
        int attempts = 0;

        Scanner sc = new Scanner(System.in);

        while (attempts < maxAttempts) {
            System.out.println("Enter your username: ");
            String username = sc.nextLine();

            System.out.println("Enter your password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect username or password. Attempt " + attempts + " of " + maxAttempts);
                if (attempts == maxAttempts) {
                    System.out.println("Maximum login attempts exceeded. Access blocked.");
                }
            }
        }

        sc.close();
    }
}
