package Ex07;

import java.io.IOException;
import java.util.Scanner;

public class Ex_07_04 {
    public static void main(String[] args) throws IOException {
        //throws IOException 는 16행의 System.in.read()을 실행시키기 위한 요소.
        //throws IOException 는 에러를 어떻게 처리하는지를 설정하는 문구. 저 에러가 나온다면 예외처리 하라고 넣은 것.
        Scanner sc = new Scanner(System.in);        //입력을 받는 변수 sc.
        int a, b;
        char ch;

        while (true) {      //무한 반복.
            System.out.printf("계산할 첫번째 수를 입력 : ");
            a = sc.nextInt();   //정수타입 을 입력 받고 그 값을 a 에 넣음.
            System.out.printf("계산할 두번째 수를 입력 : ");
            b = sc.nextInt();   //정수타입 을 입력 받고 그 값을 b 에 넣음.
            System.out.printf("계산할 연산자를 입력 : ");
            ch = (char)System.in.read();    //문자 char 을 읽는 함수 read 이며, System.in 으로 입력을 받는다. 입력은 문자형 변수 ch에 들어간다.

            switch (ch) {       //문자형 변수 ch에 들어온 입력 값에 따라 case 실행. 만약 case 에 입력값과 동일한 값이 없다면 default 로 들어감.
                case '+' :
                    System.out.printf("%d + %d = %d입니다.\n", a, b, a+b);
                    break;
                case '-' :
                    System.out.printf("%d - %d = %d입니다.\n", a, b, a-b);
                    break;
                case '*' :
                    System.out.printf("%d * %d = %d입니다.\n", a, b, a*b);
                    break;
                case '/' :
                    System.out.printf("%d / %d = %d입니다.\n", a, b, a/b);
                    break;
                case '%' :
                    System.out.printf("%d %% %d = %d입니다.\n", a, b, a%b);
                    break;
                default:
                    System.out.printf("연산자를 잘못 입력했습니다.\n");
            }
        }
    }
}
