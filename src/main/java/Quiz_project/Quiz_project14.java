package Quiz_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz_project14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

//        System.out.print("입력할 값 갯수 입력 : (정수입력)");
//        int size = sc.nextInt();

        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            list.add(num);
        }




        for(int i = 0; i < list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) > list.get(j)){
                    int change = list.get(i);
                    list.set(list.get(i), list.get(j));
                    list.set(list.get(j), change);
                }
            }
        }
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
