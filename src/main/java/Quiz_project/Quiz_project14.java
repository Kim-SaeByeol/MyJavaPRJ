package Quiz_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz_project14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(5);
        for(int i = 0; i < 5; i++){
            int num = sc.nextInt();
            boolean check = false;
            for(int j = 0; j < list.size(); j++){
                if(list.get(j) == num){
                    check = true;
                    break;
                }
            }
            if(check == false) {
                list.add(num);
            }
        }
        for(Integer i : list) {
            System.out.print(i + " ");
        }

    }
}