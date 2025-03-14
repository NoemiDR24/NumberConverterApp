import java.util.Scanner;

public class ConsoleUI {
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("********** NUMBER CONVERTER **********");
        System.out.println("(1) BINARY TO DECIMAL");
        System.out.println("(2) DECIMAL TO BINARY");
        System.out.println("(3) ROMAN TO DECIMAL");
        System.out.println("(4) DECIMAL TO ROMAN");
        System.out.println("(5) HEXADECIMAL TO DECIMAL");
        System.out.println("(6) DECIMAL TO HEXADECIMAL");
        System.out.println("(7) OCTAL TO DECIMAL");
        System.out.println("(8) DECIMAL TO OCTAL");
        System.out.println("(9) EXIT\n");
        System.out.print("SELECT AN OPTION: ");
    }

    public int getUserInput() {
        while (!scanner.hasNextInt()) {
            System.out.println("INVALID INPUT. PLEASE ENTER A NUMBER: ");
            scanner.next(); // Consume invalid input
        }
        return scanner.nextInt();
    }
    public String getUserInputAsString() {
        return scanner.next();
    }

    public void displayResult(String result) {
        System.out.println("CONVERTED RESULT: " + result +"\n\n");
    }

    public void displayErrorMessage(String message) {
        System.out.println("ERROR: " + message);
    }
}
