package Quiz_project;

import java.util.Scanner;

public class Quiz_project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("보고 싶은 정수 값을 입력해주세요 ==> ");
        int a;
        a = sc.nextInt();

        if(a%3 == 0) {
            System.out.printf("3의 배수입니다.");
        }else {
            System.out.printf("3의 배수가 아닙니다.");
        }
        System.out.printf("프로그램 종료");
    }       //2320110184 김새별
}
