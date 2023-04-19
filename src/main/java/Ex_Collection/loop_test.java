package Ex_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class loop_test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("반복문");

        for (int i = 0; i < 1; i++) {
            System.out.println("1세대 " + list + ("for"));
        }

        Iterator<String> it = list.iterator();
        //it의 주소값 중 다음 값이 있으면 true, 없으면 false. Next => 다음. has => 가지다.
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("1.5세대" + list + "while");
        }

        for (String sum : list)
            System.out.println("2세대" + sum + "for each ");

        list.forEach(sum -> System.out.println("3세대" + sum + "for each 줄임"));

        list.parallelStream().forEach(sum -> System.out.println("4세대" + sum + "비동기식 for each문"));

    }
    
}