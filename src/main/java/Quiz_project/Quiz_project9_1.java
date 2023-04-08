package Quiz_project;
//입력받은 숫자가 5개(중복x)일때, 그 숫자들을 크기가 작은순으로 정렬하게 코딩
//만약 중복이라면 프로그램 종료.(return)
import java.util.Scanner;

public class Quiz_project9_1 {
    public static void main(String[] args) {
        System.out.println("선택 정렬. 오름차순 + (중복제거) 나타내기.");
        Scanner sc = new Scanner(System.in);

        //number 는 배열의 수를 나타내고, volume 은 배열 안에 값을 나타냄.
        int number, volume;
        System.out.printf("몇 칸의 배열을 만들것인가? : 정수입력\n");
        number = sc.nextInt();

        //입려 받은 number 의 값 만큼 배열 칸 생성.
        int array[] = new int[number];

        //배열에 값을 집어넣는 문장. volume 값이 인덱스[0] 부터 length 즉, 끝까지 들어감.
        System.out.println("배열 안에 값을 넣어보자.");
        for (int i = 0; i < array.length; i++) {
            volume = sc.nextInt();
            array[i] = volume;
        }

//        k => 1 ~ 5 = 0 ~ 4, i => 0 ~ 4, j => 1 ~ lengh
        int change = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                // '>' 를 '<' 로 바꾸면 내림차순
                if(array[i] == array[j]) {
                    System.out.print("중복이 있네요. 프로그램 종료!");
                    return;
                }
                if (array[i] > array[j]) {
                    change = array[i];
                    array[i] = array[j];
                    array[j] = change;
                }
            }
        }
        System.out.println("오름차순으로 정렬");
        //올바르게 오름차순으로 되었는지 배열의 값 순서대로 확인.
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
        sc.close();
    }
}
