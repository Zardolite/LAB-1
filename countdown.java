public class countdown{
    public static void main(String []arg) throws InterruptedException{
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    System.out.println("BOOM");
    }
}
