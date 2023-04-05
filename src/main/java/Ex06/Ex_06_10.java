package Ex06;

import java.util.Scanner;

public class Ex_06_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = 0;        //메모리에 hap = 0 으로 저장했다.
        int i;
        int num;

        System.out.printf("값 입력 : ");
        num = sc.nextInt();     //입력 값을 num 에 저장.

        for(i = 1; i <= num; i++) {     //i는 1부터 입력값 num 만큼 반복.
            hap = hap + i;  //hap은 i의 값을 모두 합한다.
        }
        System.out.printf("1에서 %d까지의 합 : %d\n", num, hap);
    }
}
