import java.util.Scanner;

public class max{
    public static void main(String []arg){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a first integer");
        int a = scanner.nextInt();
        System.out.println("Enter a second integer");
        int b = scanner.nextInt();
        System.out.println("The maximum between these two values is " + Math.max(a, b));
    }
}
