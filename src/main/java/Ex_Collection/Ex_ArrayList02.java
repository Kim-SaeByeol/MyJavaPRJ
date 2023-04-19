package Ex_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex_ArrayList02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //List 객체에 데이터 추가하기
        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        //List 저장된 데이터 수
        int size = list.size();
        System.out.println("저장된 데이터 수 : " + size);

        System.out.println("1세대 반복문");
        //단점 : 반드시 반복의 횟수를 알아야하고,
        //반복의 횟수를 만약 배열의 길이(length or list.size) 로 구할 경우 메모리를 길이를 구하는데 계속 잡아먹음.
        for(int i = 0; i < size; i++) {
            System.out.println("이름 : " + list.get(i));
        }
        System.out.println();

        System.out.println("2세대 반복문");
        //2세대 for문
        // 장점 : 반복횟수를 몰라도 반복문을 사용할 수 있음.
        //list 배열에 있는 값이 네임에 순차적으로 전부 들어감.
        for(String name : list) {
            System.out.println("이름 : " + name);
        }

        System.out.println();

        System.out.println("3세대 반복문");
        //3세대 forEach문
        //장점 : 코딩해야하는 길이가 감소함. 람다식 적용.
        //list.forEach() 함수를 사용. 변수 name 은 var 적용이 되어 list 선언 타입 그대로 받음.
        list.forEach(name -> System.out.println("name :" + name));

        System.out.println();

        System.out.println("4세대 반복문");
        //4세대 비동기식(저장 순서 무시하고 처리 결과를 가져옴)
        // 처리 속도가 가장 빠름.
        // 단, 예측이 어렵고 끝을 모르기에 오류가 발생해도 어디서 발생했는지 알 수 없음
        list.parallelStream().forEach(name -> System.out.println("name : " +name));

        System.out.println();


        //1세대 for문의 단점을 커버하기 위해 나온 반복문.
        //반복 횟수를 몰라도 사용이 가능함.
        //단, 사용을 위해 terator 라는 반복을 위한 객체를 생성했음.
        System.out.println("1.5세대 반복문");

        //terator => 반복하다. 반복을 위해 만들어진 객체
        Iterator<String> it = list.iterator();

        //it의 주소값 중 다음 값이 있으면 true, 없으면 false. Next => 다음. has => 가지다.
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }

}
