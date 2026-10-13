import java.util.Scanner;

public class Prime{
    public static void main(String []arg){
    primeNumber();
    }


    public static void primeNumber(){
    boolean prime = true;
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter a non strictly positive integer");
    int a = scanner.nextInt();
    for ( int i = 2; i < a; i++ ){
        if ( a%i == 0){
            prime = false;
            break;
            }
        }
    if (prime){
        System.out.println("It is a prime number");
        }
    else{
        System.out.println("It is not a prime number");}
    }
}
