package Sort;

import java.util.Scanner;

//산업기사 Pg 390삽입 - 버블 정렬
public class Bobble_Sort {
    public static void main(String[] args) {
        System.out.println("버블 정렬. 오름차순으로 나타내기.");
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
        System.out.println("오름차순으로 정렬");
        /*
        <1> [0] 과 [1], [1] 과 [2] , [2] 와 [3], [3] 과 [4]. 4 고정
        <2> [0] 과 [1], [1] 과 [2], [2] 와 [3]. 3 고정
        <3> [0] 과 [1], [1] 과 [2]. 2 고정
        <4> [0] 과 [1]. 0 과 1 고정.
        k = 1, i = 0, j = 1 이면,
        <k++>[i++] 와 [j++], [i+1 ++] 와 [j+1 ++], [i+2++] 와 [j+2++]
        버블 정렬 끝.
                 */
        int change = 0;
        for (int k = 1; k < array.length; k++) {
            for (int i = 0, j = 1; j <= array.length - 1; i++, j++) {
                // '>' 를 '<' 로 바꾸면 내림차순
                if (array[i] > array[j]) {
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
