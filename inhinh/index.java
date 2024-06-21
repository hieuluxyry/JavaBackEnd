import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangleBottomLeft();
                    break;
                case 3:
                    printSquareTriangleTopLeft();
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (Bottom-left)");
        System.out.println("3. Print the square triangle (Top-left)");
        System.out.println("4. Exit");
    }

    public static void printRectangle() {
        int length = 4; // Example length
        int width = 6;  // Example width

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleBottomLeft() {
        int size = 5; // Example size

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSquareTriangleTopLeft() {
        int size = 7; // Example size

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
  }


