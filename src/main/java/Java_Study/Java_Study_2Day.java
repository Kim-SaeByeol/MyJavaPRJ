package Java_Study;
//for문에 관한.

import java.util.Scanner;
public class Java_Study_2Day {
   /*
5개의 입력 받는 정수를 큰 순서대로 출력하시오.
코드 한 줄마다 본인이 이해한 내용으로 주석 달아주길 바랍니다.

반드시 배열 사용
(입력 예) : 100, 200, 100, 300, 400
(출력 예) : 400, 300, 200, 100, 100

<1> 스캐너 선언
<2> 배열 선언
<3> 배열에 값 입력
<4> 배열 내림차순 정렬
<5> 출력
*/

    public void main(String[] args) {
        //<1> 입력을 받기 위한 스캐너 선언
        Scanner sc = new Scanner(System.in);

        //<2> 배열 선언. 배열의 길이는 5개로 잡았다.
        int arr[] = new int[5];

        //<3> 배열에 값 입력
        for(int i = 0; i < arr.length; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        //<4> 배열 내림차순 정렬
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                int change;

                //내림차순이므로 인덱스가 1 낮은 i가 j보다 작아야됨.
                if(arr[i] < arr[j]){
                    change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        //<5> 출력
        for(int i = 0; i < arr.length; i++){
            System.out.print (arr[i] + " ");
        }
        sc.close();
    }

}