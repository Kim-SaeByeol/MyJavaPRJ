public class For_Star_test4 {
    public static void main(String[] args) {
        int i, j;
        int k = 3;
        for(i = 1; i >= -1; i-- ) {
            for(j = 0; j < 5; j++) {
                if(i >= j)
                    System.out.print(" ");
                if(i < j ) {
                    if (j < k)
                            System.out.print('*');
                    }
                }
            k++;
            System.out.println();
        }
        }
    }