public class Ex_06_09 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for(i = 501; i <= 1000; i += 2) {       //i 가 501 에서 2씩 증가하며 1000 까지 올라감.
            hap += i;       // 501부터 i <= 1000 의 합 까지 계산함.
        }
        System.out.printf("500에서 1000 까지의 홀수의 합 : %d \n", hap);
    }
}
