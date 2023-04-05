package Ex07;

public class Ex_07_12 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        myLabel : for(;;) {     //무한 루프. myLabel이라는 이름의 레이블 구역을 지정. 레이블 구역은 메소드 구역임. 즉슨, 여기서는 for(; ; ) { } 의 { } 가 레이블 구역.
            for (i = 1; i<=100;  i++) { // 100번 반복.
                hap += i;       //i의 증가값을 모두 hap 에 저장함.
                if (hap > 2000) {       //hap 이 2000 보다 크다면 실행.
                    System.out.printf("%d\n", hap);
                    hap = 0;        //hap 을 0으로 초기화함.
                    break myLabel;      //myLabel 의 레이블이 여기까지 임을 나타냄. break 를 받았기에 레이블 구역인 for문을 벗어남.
                }
            }
            System.out.printf("아직도 반복중...\n");
        }
    }
}
