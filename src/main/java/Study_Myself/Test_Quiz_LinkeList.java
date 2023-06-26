package Study_Myself;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Test_Quiz_LinkeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        Collections.reverse(list);

        System.out.println("내림차순");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        Collections.sort(list);

        System.out.println();
        System.out.println("오름차순");

        list.forEach(n -> System.out.print(n + " "));
        }
    }
