package Study_Myself;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_set {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            set.add(sc.nextInt());
        }
        for(Integer i : set)
            System.out.print(i + " ");
    }
}
