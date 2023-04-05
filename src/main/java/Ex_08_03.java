import java.util.Scanner;

public class Ex_08_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aa = new int[4];      //정수형의 4칸짜리 배열 aa 선언.
        int hap = 0, i;     //hap 을 메모리에 선언하고 i의 데이터타입 선언.

        for(i=0; i <=3; i++){       // 1 ~ 3 까지 1씩 증가하여 총 3번 반복.
            System.out.printf("%d번째 숫자를 입력하세요. : ", i + 1);     //인덱스는 첫 값이 0 이기에 1을 더했다.
            aa[i] = sc.nextInt();       //i 는 0, 1, 2, 3 이므로, 배열 1번째 칸부터 4번째 칸 까지 입력을 받음.
        }
        hap = aa[0] + aa[1] + aa[2] + aa[3];
        System.out.printf("합계 ==> %d\n", hap);
    }
}
