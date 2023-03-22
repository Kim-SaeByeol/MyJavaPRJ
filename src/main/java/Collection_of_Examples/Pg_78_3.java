package Collection_of_Examples;

//import java.io.IOException;           //(char)System.in.read(); 를 쓰기 위한
import java.util.Scanner;

public class Pg_78_3 {
    public static void main(String[] args){ //throws IOException {
        int a, b, result;

        Scanner sc = new Scanner(System.in);

        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = sc.nextInt();

        System.out.printf("%c %c %c %c %c ==> ", '+', '-', '*', '/', '%');
        //char n;
        //n = (char)System.in.read();

        String str = sc.next();

        if (str.charAt(0) == '+') {
            System.out.printf("두번째 값을 입력하세요. ==>");
            b = sc.nextInt();
            result = a + b;
            System.out.printf("%d + %d = %d", a, b, result);
        }
        if (str.charAt(0) == '-') {
            System.out.printf("두번째 값을 입력하세요. ==>");
            b = sc.nextInt();
            result = a - b;
            System.out.printf("%d - %d = %d", a, b, result);
        }
        if (str.charAt(0) == '*') {
            System.out.printf("두번째 값을 입력하세요. ==>");
            b = sc.nextInt();
            result = a * b;
            System.out.printf("%d * %d = %d", a, b, result);
        }
        if (str.charAt(0) == '/') {
            System.out.printf("두번째 값을 입력하세요. ==>");
            b = sc.nextInt();
            if (b == 0) {
                System.out.printf("0으로 나누면 안됩니다.");
            } else {
                result = a / b;
                System.out.printf("%d / %d = %d", a, b, result);
            }
        }
        if (str.charAt(0) == '%') {
            System.out.printf("두번째 값을 입력하세요. ==>");
            b = sc.nextInt();

            if (b == 0) {
                System.out.printf("0으로 나누면 안됩니다.");
            }
            result = a % b;
            System.out.printf("%d %% %d =%d", a, b, result);
        }
    }
}
