
//Em um restaurante, há uma lista de espera para os clientes. Implemente um programa que permita adicionar e remover clientes dessa lista dinâmica. 
//A cada alteração, exiba a lista atualizada para que os funcionários saibam quantos clientes estão aguardando.
import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        ArrayList<String> waitingGuest = new ArrayList<>(); // create a dynamic list to hold waiting guests
        Scanner scanner = new Scanner(System.in); // create a scanner to read input from the console
        String command; // variable to hold user command
        do {
            System.out.println(
                    "enter 'add' to add a guest,'remove' to remove a guest, 'view' to view the current guests");
            command = scanner.nextLine().toLowerCase(); // transform input to lowercase to avoid error

            if (command.equals("add")) {
                System.out.print("enter guest name to add:");
                String guestName = scanner.nextLine(); // read the guest name
                waitingGuest.add(guestName); // add the guest to the list
                System.out.println("Current waiting list: " + waitingGuest); // display the updated list
            } else if (command.equals("remove")) {
                if (waitingGuest.isEmpty()) {
                    System.out.println("There are no guests to remove");
                } else {
                    System.out.print("enter a guest name to remove: "+ waitingGuest);
                    String guestName = scanner.nextLine();
                    waitingGuest.remove(guestName);
                }
            } else if (command.equals("view")) {
                System.out.println("Current waiting list:" + waitingGuest); // display the current list of guests
            } 
        } while (!command.equals("exit")); // continue until the user types 'exit'
        System.out.println("Thank you for using the waiting list system!"); // farewell message
        scanner.close(); // close the scanner to prevent resource leaks
    }
}
