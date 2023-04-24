package Java_Study;

import java.util.Scanner;

public class Java_Study_6Day {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i]= (int)(Math.random()*100 +1);
        }
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        System.out.println("[오름차순]");
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");


        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        System.out.println("[내림차순]");
        for (int i = 0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
        }
}
