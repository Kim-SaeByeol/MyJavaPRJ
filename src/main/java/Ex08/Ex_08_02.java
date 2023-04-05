package Ex08;

import java.util.Scanner;

public class Ex_08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[4];      //정수형의 4칸짜리 배열 a를 선언.
        int hap;

        System.out.printf("1번째 숫자를 입력하세요. : ");
        aa[0] = sc.nextInt();       //인덱스 0에 정수형 입력값을 저장함.

        System.out.printf("2번째 숫자를 입력하세요. : ");
        aa[1] = sc.nextInt();       //인덱스 1에 정수형 입력값을 저장함.

        System.out.printf("3번째 숫자를 입력하세요. : ");
        aa[2] = sc.nextInt();       //인덱스 2에 정수형 입력값을 저장함.

        System.out.printf("4번째 숫자를 입력하세요. : ");
        aa[3] = sc.nextInt();       //인덱스 3에 정수형 입력값을 저장함.

        hap = aa[0] + aa[1] + aa[2] + aa[3];

        System.out.printf("합계 ==> %d \n", hap);
    }
}
