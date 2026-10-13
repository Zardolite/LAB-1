import java.util.Scanner;

public class factorial{
    public static void main(String []arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer");
        int n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}
