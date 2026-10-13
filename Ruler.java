import java.util.Scanner;


public class Ruler{
    public static void main(String [] args){
    ruler();
    }
    public static void ruler() {
        Scanner scanner =  new Scanner (System.in);
        System.out.println("Please give me a not strictly positive integer");
        int a = scanner.nextInt();
        for ( int i = 1; i <= a; i++){
            if ( i % 10 == 0 ){
                System.out.print("|");}
            else{
                System.out.print("-");
                }
        }
        System.out.println();
    }
}
