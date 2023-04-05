package Ex07;

public class Ex_07_10 {
    public static void main(String[] args) {
        int hap = 0;        //메모리 선언을 위해 0을 저장.
        int i;

        for(i = 1; i <= 100; i++) {     //시작값이 1이고 조건문이 false 가 될때까지 ++ 를 받으면서 실행. 총 100번 반복.
            if( i % 3 ==0)      // 3의 배수라면 실행.
                continue;       //break 처럼 메소드를 벗어나는데, 괄호 밖으로 나가는게 아닌 괄호 밖까지 바로 이동함. 만약 for 이라면 올라가서 증감 받고 조건문을 봄.

            hap += i;       // i 의 증가값을 모두 합함.
        }
        System.out.printf("1~100까지의 합 (3의 배수 제외) : %d\n", hap);
    }
}
