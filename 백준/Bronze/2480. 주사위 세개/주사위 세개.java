import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int result;

        sc.close();

        // 모든 변수가 다른 경우
        if (a != b && b != c && a != c) {
            int max;

            if (a > b) {
                if (c > a) {
                    max = c;
                }
                else {
                    max = a;
                }
            }
            else {
                if (c > b) {
                    max = c;
                }
                else {
                    max = b;
                }
            }
            result = max * 100;
        }
        // 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else {
            // 3개의 변수가 모두 같은 경우
            if (a == b && a == c) {
                result = 10000 + a * 1000;
            }
            else {
                // a가 b혹은 c랑만 같은 경우
                if(a == b || a == c) {
                    result = 1000 + a * 100;
                }
                // b가 c랑 같은 경우
                else {
                    result = 1000 + b * 100;
                }
            }
        }
        System.out.println(result);
    }
}