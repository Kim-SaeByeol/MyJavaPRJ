package Ex09;

import java.util.Scanner;

public class Ex_09_14 {
    static int calc(int v1, int v2, String op){
        int result;
        switch(op){
            case "+" : result = v1 + v2;
                break;
            case "-" : result = v1 - v2;
                break;
            case "*" : result = v1 * v2;
                break;
            case "/" : result = v1 / v2;
                break;
            case "%" : result = v1 % v2;
                break;
            default: result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산기 입니다.");
        System.out.print("첫번째 숫자 입력 : (정수 입력)");
        int a = sc.nextInt();

        System.out.print("연산자 입력 : (+ , - , *, /, % 선택");
        String ch = sc.next();

        System.out.print("두번째 숫자 입력 : (정수 입력)");
        int b = sc.nextInt();

        int res = calc(a, b, ch);
        System.out.println("계산 결과는 : " + res);
    }
}
