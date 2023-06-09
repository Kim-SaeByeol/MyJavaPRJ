package Quiz_project;

public class Quiz_project7 {
    public static void main(String[] args) {
        int k = 2;		//단으로 사용할 k. 2단부터 시작할 것이기에 k 변수에 2를 저장했다.
        for(int i = 1; i < 10; i++) {		// 구구단의 뒷 곱셈을 의미해주기 위해 1~9 까지 반복 실행 되게 하였다.
            System.out.printf("%d X %d = %d \t", k, i, i*k);
            //printf 형식에 맞게 "%d X %d = %d" 를 넣어줌으로써 " " 안에 형식 그대로 출력되게 하였다.
            // \t은 tab을 누른 효과로, 모양을 이쁘게 맞추기 위해서 넣었습니다.

            if(i == 9){		// 만약에 i가 9가 된다면 실행합니다.
                k++;		//1~9 까지 곱하였기에 k 를 +1 해줍니다.
                i = 0;
                // for문을 다시 시작하기 위해 i를 0으로 초기화 해주었습니다.
                // 괄호를 벗어나 다시 for문에 들어가면 증감기호인 i++가 실행되기 때문에 1이 아닌 0입니다.
                System.out.printf("\n");
                // 단을 바꿈을 \n을 넣어 행을 바꿈으로써 표현했습니다.
            }
            if (k==10)	//현재의 for if 문은 무한루프 이기에 단을 뜻하는 k가 10이 된다면 for문을 벗어나게 잡았습니다.
                break;
        }
    }
}
