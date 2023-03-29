import java.util.Scanner;

public class Ex_05_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.printf("1 ~ 4 중에 선택하세요. : ");        // 입력 값은 1~4 라는 제한을 걸었다.
        a = sc.nextInt();       //입력 값을 s 에 저장.

        switch (a) {        //스위치의 결과 값은 a.
            case 1 :        // a 의 값이 1 일 경우 실행.
                System.out.printf("1을 선택했다.\n");
                break;      //switch 문을 벗어남.
        }
    }
}
