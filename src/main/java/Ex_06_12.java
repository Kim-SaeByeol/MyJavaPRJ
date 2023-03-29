import java.util.Scanner;

public class Ex_06_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int dan;

        System.out.printf("몇 단 ?");
        dan = sc.nextInt();     //입력 받은 값은 int 변수 dan에 저장.

        for (i =1; i <= 9; i++){    //1에서 9까지. 1 2 3 4 5 6 7 8 9. 총 9번 반복.
            System.out.printf("%d*%d=%d\n", dan, i, dan*i); //입력 받은 수에 1~9까지 곱한 값을 출력한다.
        }
    }
}
