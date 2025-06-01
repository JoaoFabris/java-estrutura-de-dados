import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // read input from the console
        System.out.print("enter a product number (only integers): ");
        if (scanner.hasNextInt()) { // check if the next input is an integer
            int productNumber = scanner.nextInt(); // read an integer number
            if (productNumber < 0) {
                System.out.println("Product number cannot be negative.");
            }
            if (productNumber % 2 == 0) {
                System.out.println("The product number is even.");
            } else {
                System.out.println("The product number is odd.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}
