package Ex07;

public class Ex_07_02 {
    public static void main(String[] args) {
        int hap = 0;       //메모리 heap 영역에 hap = 0 선언.
        int i = 1;         //메모리 heap 영역에 i = 1 선언.

        while (i <= 10) {   // i <= 10 조건이 true 라면 실행
            hap = hap + i;  //hap은 i의 증가한 값을 모두 더한다.
            i++;
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
