import java.util.Scanner;

public class Ex_07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {      //무한 반복
            System.out.printf("더할 첫 번째 수 입력 : ");
            a = sc.nextInt();   //정수형 입력값을 a 에 넣는다.
            System.out.printf("더할 두 번째 수 입력 : ");
            b = sc.nextInt();   //정수형 입력값을 b 에 넣는다.

            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
    }
}
