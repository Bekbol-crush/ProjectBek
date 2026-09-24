
import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int position = (a * b % 109 + 109) % 109;



        System.out.println(position);
    }
}

