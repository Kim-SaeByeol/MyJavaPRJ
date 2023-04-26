package MidTerm_Java_Study;

public class Java_Study_6Day {
    public static void main(String[] args) {
        int arr[] = new int[10];
        boolean arr2[] = new boolean[10];

            //값 입력. 1~10 까지 랜덤 값.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }



            //배열의 순서를 오름차순으로 바꿈
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        System.out.println("[오름차순]");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");


            //배열의 순서를 내림차순으로 바꿈
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
        System.out.println();
        System.out.println("[내림차순]");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        
            //중복인 값을 골라냄
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr2[j] = true;
                } else {
                    arr2[j] = false;
                }
            }
        }
            //중복 값을 제외하고 출력 배열 순서는 현재 내림차순이기에 계속 내림차순
            System.out.println();
            System.out.println("[중복제거]");
            for (int i = 0; i < arr.length; i++) {
                if (arr2[i] == false)
                    System.out.print(arr[i] + " ");
            }
        }
    }
