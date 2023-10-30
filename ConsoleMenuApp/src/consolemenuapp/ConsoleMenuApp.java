
package consolemenuapp;

import java.util.Scanner;

public class ConsoleMenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            handleChoice(choice);
        } while (choice != 0);

        System.out.println("Exiting the application.");
    }

    public static void displayMenu() {
        System.out.println("===== Menu =====");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("You selected Option 1.");
                break;
            case 2:
                System.out.println("You selected Option 2.");
                break;
            case 3:
                System.out.println("You selected Option 3.");
                break;
            case 0:
                // The loop will exit when choice is 0.
                break;
            default:
                System.out.println("Invalid choice. Please select again.");
        }
        System.out.println(); // Add a line break for clarity.
    }
}

