package Java_Study;

public class Java_Study_5Day {
    public static void main(String[] args) {
        int i, j;
        int k = 3;
        for (i = 1; i >= -1; i--) {
            for (j = 0; j < 5; j++) {
                if (i >= j)
                    System.out.print(" ");
                if (i < j & j < k)
                    System.out.print('*');
            }
            k++;
            System.out.println();
        }
        System.out.println("별찍기 1");
        System.out.println();
        k = 6;
        for (i = 0; i < 3; i++) {
            for (j = 1; j < 6; j++) {
                if (i < j & j < k) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            k--;
            System.out.println();
        }
        System.out.println("별찍기 2");
        System.out.println();
        k = 0;
        for (i = 1; i < 6; i++) {
            if (i < 3) {
                for (j = 0; j < i; j++)
                    System.out.print("*");
            } else {
                for (j = 3; j > k; j--)
                    System.out.print("*");
                k++;
            }
            System.out.println();
        }
        System.out.println("별찍기 3");
        System.out.println();
        k = 0;
        for (i = 5; i > 0; i--) {
            if (i > 3) {
                for (j = 1; j < 6; j++) {
                    if (j < i)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            } else {
                for (j = 1; j < 6; j++)
                    if (k < j)
                        System.out.print("*");
                    else
                        System.out.print(" ");

            }
            k++;
            System.out.println();
        }
        System.out.println("별찍기 4");
    }
}
