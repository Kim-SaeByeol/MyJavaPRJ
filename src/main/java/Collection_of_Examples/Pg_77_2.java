package Collection_of_Examples;

import java.util.Scanner;

public class Pg_77_2 {
    public static void main(String[] args) {
        int a, b, c, result;
        Scanner sc = new Scanner(System.in);
        System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
        a = sc.nextInt();
        System.out.printf("<1> 덧셈, <2> 뺄셈 <3> 곱셈, <4> 나눗셈 ==> ");
        b = sc.nextInt();
        if(0 >= b || b >= 5) {
            System.out.printf("오류 1~4의 정수로 다시 입력해주세요.");
        }

        if(b == 1) {
            System.out.printf("두번째 계산할 값을 입력하세요. ==> ");
            c = sc.nextInt();
            result = a + c;
            System.out.printf("%d + %d = %d\n", a, c , result);
        } else if (b == 2) {
            System.out.printf("두번째 계산할 값을 입력하세요. ==> ");
            c = sc.nextInt();
            result = a - c;
            System.out.printf("%d - %d = %d\n", a, c, result);
        } else if (b == 3){
            System.out.printf("두번째 계산할 값을 입력하세요. ==> ");
            c = sc.nextInt();
            result = a * c;
            System.out.printf("%d * %d = %d\n", a, c, result);
        } else if (b == 4) {
            System.out.printf("두번째 계산할 값을 입력하세요. ==> ");
            c = sc.nextInt();
            result = a / c;
            System.out.printf("%d / %d = %d\n", a, c, result);
        }

    }
}
