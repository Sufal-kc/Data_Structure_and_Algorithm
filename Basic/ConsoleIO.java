import java.util.Scanner;

public class ConsoleIO {
    public class static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a string
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer
        
        System.out.println("Hello " + name + "! You are " + age + " years old.");
        
        // Always close the scanner to prevent memory leaks
        scanner.close(); 
    }
}
