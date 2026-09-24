import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        System.out.println(a + b + c);
    }
}
