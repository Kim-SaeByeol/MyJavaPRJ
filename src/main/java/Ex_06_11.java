import java.util.Scanner;

public class Ex_06_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hap = 0;
        int i;
        int num1, num2, num3;       //scanner 를 3번 받기 위해 변수 3개를 선언했다.
        System.out.printf("시작 값 입력 : ");
        num1 = sc.nextInt();        // 첫번째 입력값 저장
        System.out.printf("끝 값 입력 : ");
        num2 = sc.nextInt();        // 두번째 입력값 저장
        System.out.printf("증가 값 입력 : ");
        num3 = sc.nextInt();        // 세번째 입력값 저장

        for(i = num1; i <= num2; i += num3) {
            //i를 num1 의 값으로 저장하고 num2와의 차이까지 num3의 증가값으로 반복한다.
            hap += i;   //i의 값을 계속 더한다.
        }
        System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합: %d\n", num1, num2, num3, hap);
        //hap의 값을 출력합니다.
    }
}
