import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Scanner object to get from user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store user input
        String name;
        int age;
        double weight;
        boolean isSmoker;
        
        // User's name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // User's age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // User's weight
        System.out.print("Enter your weight (in kg): ");
        weight = scanner.nextDouble();

        // User's lungs I guess
        System.out.print("Are you a smoker? (True/False) ");
        isSmoker = scanner.nextBoolean();

        // Output
        System.out.println("\n--- User Information ====");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Smoker: " + isSmoker);

        // Scanner close to prevent leak
        scanner.close();
    }
}
