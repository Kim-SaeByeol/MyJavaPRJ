package Quiz_project;

public class Quiz_project6 {
    public static void main(String[] args) {
        int i, j = 2;
        for (i = 1; i < 6; i++) {
            if (i < j) {
                System.out.print('*');
            }
            if (i == 5) {
                System.out.println();
                i = 0;      //무한 반복 루트.
                j++;        // j 의 값을 1씩 늘려줌.
            }
            if (j == 7) {
                break;      //j 가 7이 되면 for문은 5회 반복하고 for문이 끝남.
            }
                    //2320110184 김새별
        }
    }
}
