import java.util.Scanner;

public class Main{
    public static void main(String []arg){
        initializeArray();
    }
    public static void initializeArray(){
        int sum = 0
        Scanner scanner =  new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter an integer");
            int integer = scanner.nextInt();
            array[i] = integer;
            sum += array[i]
        }
    }
}
