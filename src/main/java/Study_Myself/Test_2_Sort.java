package Study_Myself;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Test_2_Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(6);
        list.add(1);
        list.add(2);
        list.add(4);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int change;

                // 내림차순이므로 인덱스가 1 낮은 i가 j보다 작아야됨.
                if (list.get(i) > list.get(j)) {
                    change = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, change);
                }
            }
        }

        // 정렬된 결과 출력
        list.forEach(n -> System.out.print(n + " "));
    }
}

