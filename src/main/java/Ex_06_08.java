public class Ex_06_08 {
    public static void main(String[] args) {
        int hap = 0;        // 초기화 안해주고 선언만 하면 hap = hap + i 에서 오류가 남.
        int i;

        for(i = 1; i <= 10; i++) {
            hap = hap +i;
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
