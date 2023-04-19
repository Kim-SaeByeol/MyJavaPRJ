package Sort;

import java.util.Scanner;

//산업기사 Pg 390삽입 - 선택 정렬
public class Selection_Sort {
    public static void main(String[] args) {
        System.out.println("선택 정렬. 오름차순으로 나타내기.");
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
        <1> [0] 과 [1],[2],[3],[4],[length] 비교
        <2> [1] 과 [2], [3], [4], [length] 비교
        <3> [2] 과 [3], [4], [length] 비교
        <4> [3] 과 [4], [length] 비교
        <5> [4] 와 [length]비교
        k => 1 ~ 5 = 0 ~ 4, i => 0 ~ 4, j => 1 ~ lengh
        <k> [i] 과 [j]
                 */
//        int change = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i+1; j < array.length; j++) {
//                // '>' 를 '<' 로 바꾸면 내림차순
//                if (array[i] < array[j]) {
//                    change = array[i];
//                    array[i] = array[j];
//                    array[j] = change;
//                }
//            }
//        }

        //<4> 배열 내림차순 정렬
        for(int i = 0; i<array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int change;

                //내림차순이므로 인덱스가 1 낮은 i가 j보다 작아야됨.
                if (array[i] < array[j]) {
                    change = array[i];
                    array[i] = array[j];
                    array[j] = change;
                }
            }
        }
                    //올바르게 오름차순으로 되었는지 배열의 값 순서대로 확인.
                    for (int i = 0; i < array.length; i++)
                        System.out.print(array[i] + " ");
                    sc.close();

    }
}
