package Ex_Collection;

import java.util.HashMap;
import java.util.Map;

public class Ex_HashMap {
    public static void main(String[] args) {
        //Map 데이터에는 (String , String) 타입의 값들이 저장된다는 뜻이다.
        //왼쪽은 '키'이며, 오른쪽은 키에 대한 '값'이다.
        Map<String, String> map = new HashMap<>();

        //put 은 값을 넣는다는 의미.
        //String, String 이기에 문자열 2개가 들어갔다.
        map.put("name", "이협건");
        map.put("email", "kopo@kopo.ac.kr");
        map.put("dept", "데이터분석과");


        //get 은 값을 꺼내오겠다는 의미.
        //키를 불러오면 키 값을 불러온다.
        // 키 ㅡ> 키 값. 반대는 안됨.
        System.out.println("조회결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));


        //set 은 중복제거를 하는 역할도 수행하는데, 값을 막 저장하기에 순서가 뒤죽박죽이 될 수 있음.
        //중복제거 로직이 있어 저장 속도는 list(중복허용)에 비해 느림.
        // {} 중괄호를 쓴 이유는 여러 줄이 될 경우 중괄호를 써야하기에 예시로 넣어봄.
        map.entrySet().forEach(entry -> {System.out.println(entry.getKey() + " : " + entry.getValue());});
    }
}
