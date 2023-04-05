public class Ex_07_11 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for( ; ; ) {        //무한루프
            for ( i = 1; i <= 100; i++) {   // 1 ~ 100 까지 1씩 증가하면서 반복.
                hap += 1;       //i 의 증가값을 모두 더함.
                if(hap > 2000) {        //hap 이 2천이 넘는다면 실행.
                    System.out.printf("%d\n", hap);     //hap의 값 출력.
                    break;  // 자신이 속한 메소드 {} 를 벗어남. 여기서는 if문을 벗어남.
                }
            }
            System.out.printf("아직도 반복중...\n");      //무한루프를 벗어나지 못했기에 계속 반복.
        }
    }
}
