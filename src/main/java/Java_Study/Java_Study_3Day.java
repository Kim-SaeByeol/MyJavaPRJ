package Java_Study;

public class Java_Study_3Day {
    public static void main(String[] args) {
        int i, j;

        //우측 계단
        for (i = 0; i < 5; i++) {
            for (j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("별찍기 1");
        System.out.println("-------------------------------");

        for (i = 5; i > 0; i--) {
            for (j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("별찍기 2");
        System.out.println("-------------------------------");
        for (i = 4; i > 0; i--) {
            for (j = 1; j < 5; j++) {
                if(j < i){

                    System.out.print(" ");
                }else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("별찍기 3");
        System.out.println("-------------------------------");
        for (i = 1; i < 5; i++) {
            for (j = 1; j < 5; j++) {
                if(j < i){
                    System.out.print(" ");
                }else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("별찍기 4");
    }
}
