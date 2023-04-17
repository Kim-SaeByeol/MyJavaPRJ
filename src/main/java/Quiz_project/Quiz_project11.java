package Quiz_project;
/*
제시한 숫자들을 차례대로 입력하여, 중복된 값이 저장되도록 구현하시오.

입력값  : 1,2,3,1,4 => 항상 동일한 5개 숫자 입력함

저장된 값 : 1,2,3,4 => 배열에는 중복이 제거되어 총 4개의 숫자

출력 메시지 : 저장된 값은 1,2,3,4입니다.

<1> 배열 생성.
<2> 값 입력
<3> 중복 제거
<4> 출력
 */
import java.util.Scanner;
public class Quiz_project11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, change, count = 0;

        //<1> 배열 생성. 중복인지 확인을 위한 boolean 배열도 같이 생성.
        int arr[] = new int[5];
        boolean truearr[] = new boolean[5];

        //<2> 배열에 값 입력.
        for (int i = 0; i < arr.length; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }

        //<3> 배열 순서 정렬
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        //<4> 중복 제거
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    truearr[i] = true;
            }
        }

        //<5> 출력
        System.out.print("저장된 값은 ");
        for (int i = 0; i < arr.length; i++) {
            if (truearr[i] == true) {
                continue;
            }
            System.out.print(arr[i] + ",");
        }
        System.out.println(" 입니다.");
        sc.close();
    }
}

