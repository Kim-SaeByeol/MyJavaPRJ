public class For_Star_test5 {
    public static void main(String[] args) {
        int i, j;
        int a = 5;
        int k = a/2+1;
        for (i = 5 / 2 - 1; i >= -1; i--) {             // i = a/2-1
            for (j = 0; j < a; j++) {                   // k = a/2+1
                if (i >= j)
                    System.out.print(" ");
                if (i < j) {
                    if (j < k)
                        System.out.print('*');
                }
            }
            k++;
            System.out.println();
        }
        k -= 2;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                if (i >= j)
                    System.out.print(" ");
                if (i < j) {
                    if (j < k)
                        System.out.print('*');
                }
            }
            k--;
            System.out.println();
        }
    }
}
