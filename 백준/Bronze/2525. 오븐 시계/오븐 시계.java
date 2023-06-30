import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int m = a * 60 + b;

        int hour = ((m+c) / 60) %24;
        int minute = (m+c) % 60;

        System.out.println(hour + " " + minute);

    }
}
