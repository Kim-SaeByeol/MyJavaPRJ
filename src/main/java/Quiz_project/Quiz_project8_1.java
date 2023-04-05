package Quiz_project;

public class Quiz_project8_1 {
    //while 1번 써서 활용하여 구구단 만들기.
    // while 에 무한루프 말고 조건문 박기.
    public static void main(String[] args) {
        int i=0, j=2;   //i = 1~9 의 값을 나타내고, j 는 단을 나타냅니다.
        while (i < 10) {
                    i++;
            System.out.printf("%d X %d = %d \t",j,i,i*j);
            //i가 1~9를 찍으면 j 를 +1 해주어 단을
            if (i == 9){
                j++;
                i = 0;
                System.out.printf("\n");
            }
            //i = 10 이면 while 조건문이 false 이므로, break 와 같은 효과.
            if (j == 10)
                i = 10;
        }
        //2320110184 김새별
    }
}
