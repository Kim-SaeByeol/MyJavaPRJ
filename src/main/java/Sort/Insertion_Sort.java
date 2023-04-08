package Sort;

import java.util.Scanner;

//산업기사 Pg 390삽입Pg 390삽입 - 삽입 정렬
public class Insertion_Sort {
    public static void main(String[] args) {

        System.out.println("삽입 정렬. 오름차순으로 나타내기.");
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
//         <1> 두번쨰 와 첫번째 비교     [1] 과 [0] 비교
//         <2> 세번째와 첫번째, 두번째 비교     [2] 와 [0] [1] 비교
//         <3> 네번째와 첫번째, 두번째, 세번째 비교    [3] 과  [0] [1] [2] 비교
//         <4> 다섯번째와 첫번째, 두번재, 세번째, 네번째 비교
//         n 번째와 n-1 , n-2, n-3 비교

        //array[i]가 기준점이 되어 i보다 작은 수와 비교하는 삽입정렬의 식.
        System.out.println("오름차순으로 정렬");
        int change = 0;
        for (int i = 1; i < array.length; i++) {         // 1 2 3 4
            for (int j = 0; j < i; j++) {           // 0 , 0 1 , 0 1 2 , 0 1 2 3
                // '<' 를 '>'로 바꾸면 내림차순
                if (array[i] < array[j]) {
                    change = array[i];
                    array[i] = array[j];
                    array[j] = change;
                }
            }
        }
        //올바르게 오름차순으로 되었는지 배열의 값 순서대로 확인.
        for (int i = 0; i < array.length; i++)
        System.out.print(array[i]);
        sc.close();
    }
}
