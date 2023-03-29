public class Ex_for_multiplication_tables {
    public static void main(String[] args) {
        int result;
        System.out.printf("구구단을 외우자\n");
        for (int i = 1; i <= 9; i++ ) {
            for (int j = 1; j <= 9; j++) {
                result = i * j;
                System.out.printf("%d*%d=%d\t", i, j, result);
            }
            System.out.printf("\n");
        }
    }
}
