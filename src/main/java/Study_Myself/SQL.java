package Study_Myself;

import java.util.*;

public class SQL {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //2차열 배열과 같음. 행은 Map 이고 List 값은 열임.
        List<Map<String, String>> list = new ArrayList<>();

        //객체 선언을 하지 않음. 메모리에 올라가지 않음.
        Map<String, String> map = null;

        //반복 횟수를 정함
        System.out.println("몇개의 테이블을 생성할까 : (정수입력)");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("ENAME : ");
            String ename = sc.next();


            System.out.print("ENPTO : ");
            String enpto = sc.next();


            System.out.print("JOB : ");
            String job = sc.next();

            //값을 넣기 위해 메모리에 선언함
            map = new HashMap<>();

            //HashMap 에 데이터 값을 저장함
            map.put("ENAME", ename);
            map.put("ENPTO", enpto);
            map.put("JOB", job);

            // 입력 값을 리스트(행)에 추가함.
            list.add(map);

            //리스트에 값을 올렸으니 map의 값은 더 이상 필요가 없음.
            //필요 없는 데이터 이기에 null 값을 주어 메모리 용량을 줄임
            map = null;
        }

        //리스트에 들어간 값을 출력
        list.forEach(table -> System.out.println("table : " + table));

    }
}
