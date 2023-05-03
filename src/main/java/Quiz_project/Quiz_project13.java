package Quiz_project;

import java.util.LinkedList;
import java.util.Scanner;

public class Quiz_project13 {
    public static void main(String[] args) {
        //입력을 받기 위한 스캐너 선언
        Scanner sc = new Scanner(System.in);

        ////new로 객체선언을 통한 타입 파라미터 생략
        LinkedList<Integer> list = new LinkedList<>();

        //리스트에 값을 입력 받아 저장
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }

        //정렬 로직
        for(int i = 0; i < list.size(); i++){
            for (int j = i+1; j < list.size(); j++){

                //Java 에서는 list.get() 함수를 제공.
                //이는 인덱스를 불러오기에 노드 없이 정령리 가능.
                //단, 함수 내부의 동작이 순차탐색이기에 속도가 느림.
                if(list.get(i) < list.get(j)){
                    int change = list.get(i);

                    //set(int index, E element)
                    //해당 인덱스에 저장할 요소가 element 이며, 내부 데이터를 외부에서 지정하기에 제네릭 타입이 들어간다.
                    //해당 LinkedList는 Integer 타입으로 선언 되어있기에 저장할 요소 또한 Integer 여야한다.
                    list.set(i, list.get(j));
                    list.set(j, change);
                }

            }
        }
        //list 의 값 전부를 출력하는 로직
        //해상 list가 Integer 이기에 i 는 Integer 또는 Object 타입으로 선언해야하며
        //list의 값이 순서대로 i에 저장되어 i는 list의 값을 다 받을 떄 까지 반복한다.
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
