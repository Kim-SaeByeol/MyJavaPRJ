package Ex07;

public class Ex_07_09 {
    public static void main(String[] args) {
        int hap = 0;        //메모리 선언을 위해 0을 넣음.
        int i;

        for(i = 1; i <= 100; i++){      //시작값 1부터 조건문이 false가 될때까지 값은 ++ 받으며 false가 나올때까지 진행.
            hap = hap +i;   //i 의 증가값을 hap 에 모두 더함.

            if(hap>=1000)       //hap 이 1000 보다 커지면 실행.
                break;      // 메소드 영역인 for문을 벗어남.
        }
        System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는? : %d\n", i);
        System.out.printf("1~100의 합에서 최초로 1000이 넘는 수는? : %d\n", hap);
    }
}
