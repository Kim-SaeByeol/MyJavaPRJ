package Ex05;

import java.util.Scanner;

public class Ex_05_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.printf("정수를 입력하세요 : ");
        a = sc.nextInt();

        if(a >= 90) {
            System.out.printf("A");   //입력 값 a 가 90 이상이면 A 출력 후 if 문을 빠져나감.
        } else if (a >= 80) {
            System.out.printf("B");   //입력 값 a 가 80 이상이면 B 출력 후 if 문을 빠져나감.
        } else if(a >= 70) {
            System.out.printf("C");   //입력 값 a 가 70 이상이면 C 출력 후 if 문을 빠져나감.
        } else if (a >= 60) {
            System.out.printf("D");    //입력 값 a 가 60 이상이면 D 출력 후 if 문을 빠져나감.
        } else
            System.out.printf("F");     //입력 값 a 가 60 미만 이라면 F 출력.

        //else if 의 경우에는 조건문에 사용되는 기준 변수가 항상 같을 경우에만 사용.
    }
}
