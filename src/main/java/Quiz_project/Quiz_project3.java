package Quiz_project;

import java.util.Scanner;

public class Quiz_project3 {
    public static void main(String[] args) {


        int i;
        Scanner sc = new Scanner(System.in);
        System.out.printf("입력 값 : ");
        i = sc.nextInt();
        if (i % 2 == 0) {
            if (i % 3 == 0) {
                System.out.println("2와 3의 배수 입니다.");
            } else {
                System.out.println("2의 배수 입니다.");
            }
        }
        if (i % 3 == 0) {
            System.out.println("3의 배수 입니다.");
        }
        if(i % 2 != 0 && i % 3 != 0) {
            System.out.println("3과 2의 배수가 아닙니다.");
        }
        System.out.println("프로그램 종료");
    }
}
