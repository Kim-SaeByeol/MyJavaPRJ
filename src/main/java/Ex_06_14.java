public class Ex_06_14 {
    public static void main(String[] args) {
        int i, k;

        for(i=2; i <= 9; i++){      //2부터 9까지 반복.
            for(k=1; k <= 9; k++) {     //
                System.out.printf("%d*%d=%d\n", i, k, i*k);
            }
            System.out.printf("\n");
        }
    }
}
