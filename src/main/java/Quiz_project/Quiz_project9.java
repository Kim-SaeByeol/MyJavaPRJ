package Quiz_project;

import java.util.Scanner;

//입력받은 숫자가 5개(중복불가)일때, 그 숫자들을 크기가 작은순으로 정렬하게 코딩
//만약 중복이라면 "중복입니다" 를 알린 후 다시 입력하도록 설정.
public class Quiz_project9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //number = 배열의 수를 결정
        int number;
        System.out.println("몇 칸의 배열을 만들 것인가? : 1~100 사이 정수입력");
        number = sc.nextInt();

        //입력 받은 수 만큼 배열 생성
        int arr[] = new int[number];

        //배열에 넣을 값을 입력 받는 volume.
        int volume;
        System.out.println("배열 안에 값을 넣어보자.");
        System.out.println("1~100 사이 정수. 입력은 하나씩만 받습니다. (입력 후 엔터를 눌러주세요!)");
        for(int i = 0; i < arr.length; i++) {
            volume = sc.nextInt();
            arr[i] = volume;
            System.out.println("i의 값 : " + i);

            //중복된 값을 찾기 위함.
            if (i != 0){
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("중복된 값이 있네요! 다시 입력해주세요.");
                    System.out.print("현재 입력된 값 "+ arr[i]+ " ");
                    System.out.println();
                    --i;
                    System.out.println("나갔어요  " + "i의 값 : " + i);
                    break;
                }
            }
            }
        }
        int change = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }

            }
        }
        System.out.println("오름차순으로 출력!");
        //입력된 값 출력.
     for (int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " ");
    sc.close();
    }
}
