package Ex_Collection;

import java.util.*;

public class ArrayList_And_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2차열 배열과 같음. 행은 Map 이고 List 값은 열임.
        List<Map<String, String>> list = new ArrayList<>();

        //객체 선언을 하지 않음. 메모리에 올라가지 않음.
        Map<String, String> map = null;

        for(int i = 0; i < 3; i++) {
            System.out.println("이름 : ");
            String name = sc.next();

            System.out.println("이메일 : ");
            String email = sc.next();

            System.out.println("부서 : ");
            String dept = sc.next();

            //행(Low)에 집어넣을 것을 나타냄.
            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("dept", dept);

            // 입력 값을 리스트(행)에 추가함.
            list.add(map);

            map = null;
        }
        //열(calumm)의 갯수 (리스트의 갯수) 를 나타냄.
        System.out.println("저장된 데이터 수 : " + list.size());
        //행에 있는 모든 Map 의 값을 불러옴
        for(int i = 0; i < list.size(); i++){

            //0행부터 2행까지.
            Map<String, String> rMap = list.get(i);

            System.out.println(i+1 +"행(List)");
            //get 을 통해 정보를 불러옴
            System.out.print("name : " + rMap.get("name"));
            System.out.print(" email : " + rMap.get("email"));
            System.out.print(" dept : " + rMap.get("dept"));

            System.out.println();
            // 값이 많으면 갈비지 컬렉션이 오류가 날 수 있으므로 항상 변수는 초기화.
            rMap = null;
        }
    }
}
