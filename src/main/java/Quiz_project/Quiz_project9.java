package Quiz_project;

import java.util.Scanner;

//입력받은 숫자가 5개(중복불가)일때, 그 숫자들을 크기가 작은순으로 정렬하게 코딩
public class Quiz_project9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //배열에 넣을 값으로 Number 변수 선언.
        int Number;
        //정수타입 배열 Array에 5칸 을 줌.
        int Array[] = new int[5];

        //배열 Array에 인덱스 0 부터 4까지 순서대로 정수값을 입력하여 저장함.
        for (int i = 0; i < Array.length; i++) {
            Number = sc.nextInt();
            Array[i] = Number;
        }
        //중복이라면 return 을 통해 반환값이 없는 void 메소드에서 빠져나감. => main 메소드를 빠져나가기에 그대로 종료.
        for(int i = 1; i < Array.length; i++) {
            if (Array[0] == Array[i]) {
                System.out.printf("중복 값이 있네요! 프로그램 종료!");
                return;
            }
        }
        //변수를 바꿔야하기에 change 변수를 선언함.
        int change;
        //i를 고정값으로 잡고 나머지 인덱스의 수를 비교하는 식을 만듬.
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (Array[i] < Array[j]) {
                    /*
                    변수 교환 공식.
                    c = a
                    a = b
                    b = c
                     */
                    change = Array[i];
                    Array[i] = Array[j];
                    Array[j] = change;
                }
            }
        }
        //출력을 위해 for문을 사용하여 Array 의 모든 값을 출력함.
        for (int i = 0; i < Array.length; i++)
        System.out.print(Array[i]);
    }
    //2320110184 김새별
}
