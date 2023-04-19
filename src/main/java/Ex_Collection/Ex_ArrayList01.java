package Ex_Collection;

import java.util.ArrayList;
import java.util.List;
public class Ex_ArrayList01 {
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
    }
}
