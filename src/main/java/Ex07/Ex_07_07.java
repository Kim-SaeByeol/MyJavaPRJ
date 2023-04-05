package Ex07;

public class Ex_07_07 {
    public static void main(String[] args) {
        int i;
        for(i = 1; i <=100; i++) {      // 시작값 1 부터 조건문이 false 일때까지 1씩 증가하며  총 100 번 반복함.
            System.out.printf("for 문을 %d 회 실행하셨습니다.\n", i);
            break;      //break 는 실행을 멈추라는 명령어. break 가 포함된 메소드를 벗어나게 한다.
                        //출력하고 break 이므로, i는 1이기에 1회 실행을 출력하고 for문을 벗어남.
        }
        System.out.printf("for문을 종료하겠습니다.");
    }
}
