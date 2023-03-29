public class Ex_06_07 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for(i = 1; i <= 10; i++) {
            hap = hap + i;
            /*variable hap might not have been initialized
              ==> 변수 hap이 초기화되지 않았을 수 있습니다.
              메모리에 올라가는 시점은 변수 = 값 을 저장하여 메모리에 저장할때임..*/
        }
        System.out.printf("1에서 10까지의 합 : %d \n", hap);
    }
}
