import java.util.Scanner;
// initializing our code
public class parity{
    public static void main(String []arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer"); // the message asking to enter our number
        int a = scanner.nextInt(); // here we will scan an int
        int b = a%2; // the operator % will give the modulo
        if (b == 0){ // if b == 0, it means there is no modulo
            System.out.println("the number " + a + " is an even number");
        }
        else{ // we could also write else if ( b== 1 ) but this option works too
            System.out.println("the number " + a + " is an odd number");
        }
    }
}
