import java.util.Scanner;

public class division {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first integer");
        int firstInteger = scanner.nextInt();
        System.out.println("Please enter the second integer");
        int secondInteger = scanner.nextInt();
        double div = (double) firstInteger / secondInteger;
        System.out.println("The division of " + firstInteger + " and " + secondInteger + " is equal to " + div);
    }  
}