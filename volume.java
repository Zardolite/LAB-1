import java.util.Scanner;

public class volume {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length");
        double l = scanner.nextInt();
        System.out.println("Please enter the width");
        int w = scanner.nextInt();
        System.out.println("Please enter the height");
        double h = scanner.nextInt();
        double V = l * w * h;
        System.out.println("The Volume of " + l + " and " + w + " and " + h + " is equal to " + V);
    }  
}