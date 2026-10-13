import java.util.Scanner;

public class main { // declare our class named main
    public static void main(String[] args) { // runs our program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, what is your first name?");
        String firstName = scanner.nextLine();
        System.out.println("Hello, " + firstName + "!");
    }
}