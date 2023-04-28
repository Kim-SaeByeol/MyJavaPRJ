package Study_Myself;

import java.util.HashMap;

public class Hash_Map {
    // HashMap 선언
    // <키값 타입, 데이터 값 타입>을 지정해서 선언해준다.
    // 파라미터 에도 해당 값임 선언한다.
    HashMap<String,String> map1 = new HashMap<String,String>();

    ////new에서 타입 파라미터는 생략이 가능하다.
    HashMap<String,String> map2 = new HashMap<>();

    //map1의 모든 값을 가진 HashMap생성
    //값을 받은 이후 map 1의 값이 변하더라도 혹은 값을 받은 map 3의 값이 변하더라도
    //둘은 아예 다른 객체 이기에 변화가 없다.
    HashMap<String,String> map3 = new HashMap<>(map1);

    //초기 용량(capacity)지정
    //HashMap 또한 가변적인 크기를 가지는데, 용량이 커질 때는 그 만큼 커지는 것이 아닌 2배 로 커지기에
    //가능하면 지정 용량을 정해주는 것이 좋다.
    HashMap<String,String> map4 = new HashMap<>(10);

    //초기 용량(capacity),언제 용량을 늘릴지 (load factor)지정
    //용량이 다 차기 전에 늘려야 충돌이 나지 않기에 로드 팩토리를 통해 미리 늘려준다.
    //여기서는 0.7 즉슨 70%가 차면 해쉬맵의 크기가 증가할 것이다.
    HashMap<String,String> map5 = new HashMap<>(10, 0.7f);

    //값 지정 하는 법.
    //키 값 a 에 b의 데이터가 들어갔다.
    //[Key]: a [Value]: b
    HashMap<String,String> map6 = new HashMap<String,String>(){{
        put("a","b");
        put("a","b");
    }};
}
