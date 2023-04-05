package Quiz_project;

public class Quiz_project8 {
    //while 1번 써서 활용하여 구구단 만들기
    public static void main(String[] args) {
        int i = 0, j = 2;   //i는 1 ~ 9로 찍힐 값. j 는 단을 표현합니다.
        while (true) {
            i++;    //시작부터 1을 주기 위함.
            System.out.printf("%d X %d = %d\t", j, i, j * i);

            //i가 1~9 로 반복되며 찍히면 j의 값을 증가시키고 i를 다시 0으로 초기화하며 열을 넘깁니다.
            if (i == 9) {
                j++;
                i = 0;
                System.out.printf("\n");
            }

            //j가 9단을 찍고 j++를 타고 j가 10이 되면 멈춥니다.
            if (j == 10)
                break;
        }
        //2320110184 김새별
    }
}
