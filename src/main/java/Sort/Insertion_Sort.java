package Sort;

import java.util.Scanner;

//산업기사 Pg 390삽입 - 삽입 정렬
public class Insertion_Sort {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number, volume;
        System.out.printf("몇 칸의 배열을 만들것인가? : 정수입력\n");
        number = sc.nextInt();
        int array[] = new int[number];

        for (int i = 0; i < array.length; i++) {
            volume = sc.nextInt();
            array[i] = volume;
        }
//         <1> 두번쨰 와 첫번째 비교     [1] 과 [0] 비교
//         <2> 세번째와 첫번째, 두번째 비교     [2] 와 [0] [1] 비교
//         <3> 네번째와 첫번째, 두번째, 세번째 비교    [3] 과  [0] [1] [2] 비교
//         <4> 다섯번째와 첫번째, 두번재, 세번째, 네번째 비교
//         n 번째와 n-1 , n-2, n-3 비교
        System.out.println("배열 안에 값을 넣어보자.");
        int change = 0;
        for (int i = 1; i < array.length; i++) {         // 1 2 3 4
            for (int j = 0; j < i; j++) {           // 0 , 0 1 , 0 1 2 , 0 1 2 3
                if (array[i] < array[j]) {
                    change = array[i];
                    array[i] = array[j];
                    array[j] = change;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
        System.out.print(array[i]);
    }
}
