package Quiz_project;

import java.util.Scanner;

//5개의 입력 받는 정수 중 가장 큰 값과 가장 작은 값, 평균 값을 출력하라.
public class Quiz_project10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // <1> 5개의 입력 받는 정수를 저장할 배열을 생성.
        int arr[] = new int[5];

        //<2> arr 배열에 값을 하나씩 저장함.
        //<3> 평균 값을 위해 모든 배열의 합의 값을 저장할 sum
        int sum = 0;
        for (int i = 0; i<5; i++) {
            int num = sc.nextInt();
            arr[i] = num;
            sum += arr[i];
        }

        // <4> 선택정렬을 통한 오름차순.
        int change = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< args.length; j++){
                if (arr[i] > arr[j]){
                    change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }

        //<5> 오름차순으로 인해 가장 큰 값은 배열의 마지막, 가장 작은 값은 배열의 첫번째 값.
        //평균은 입력된 배열의 총 합을 배열의 길이 만큼 나눈 값.
            System.out.println("가장 큰 값 : " + arr[arr.length-1]);
            System.out.println("가장 작은 값 : " + arr[0]);
            System.out.println("평균 값 : " + (sum / arr.length));
    }
}
