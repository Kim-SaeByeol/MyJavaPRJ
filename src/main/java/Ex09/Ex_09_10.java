package Ex09;

import java.util.Scanner;

public class Ex_09_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee;

        System.out.printf("어떤 커피 드릴까요? (1: 보통, 2: 설탕, 3: 블랙)");
        coffee = sc.nextInt();

        System.out.printf("\n#1. 뜨거운 물을 준비한다.\n");
        System.out.printf("#2. 종이컵을 준비한다.");
    }
}
