import java.util.Scanner;

public class quadratic{
    public static void main(String []arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the value of a?");
        int a = scanner.nextInt();
        System.out.println("What is the value of b?");
        int b = scanner.nextInt();
        System.out.println("What is the value of c?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println( "this polynomial has two imaginary root which are equal to: " + (-b)/(2*a) + " + i" + Math.sqrt(-delta)/(2*a) + " and "  + (-b)/(2*a) + " - i" + Math.sqrt(-delta)/(2*a));
        }
        else if ( a == 0 ) {
            System.out.println("a cannot be equal to 0.");
        }
        else if (delta == 0 ) {
            System.out.println( " this polynomial has one real root which is equal to: " + ( -b)/(2*a) );
        }
        else{
            System.out.println( "this polynomial has two real root which are equal to: " + ( -b + Math.sqrt(delta))/(2*a) + " and " + ( -b - Math.sqrt(delta))/(2*a));
        }
    }
}
