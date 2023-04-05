package Ex07;

import java.util.Scanner;

public class Ex_07_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true){       //무한 루프.
            System.out.printf("더할 첫 번째 수 입력 : ");
            a = sc.nextInt();   //정수형 입력값을 정수형타입 a 에 넣음.
            System.out.printf("더할 두 번째 수 입력 : ");
            b = sc.nextInt();   //정수형 입력값을 정수형타입 b 에 넣음.

            if( a == 0)     //변수 a에 입력값 0 이 들어갔다면 break.
                break;

            System.out.printf("%d + %d = %d \n", a, b, a+b);
        }
        System.out.printf("0을 입력해서 반복문을 탈출했습니다.");
    }
}
