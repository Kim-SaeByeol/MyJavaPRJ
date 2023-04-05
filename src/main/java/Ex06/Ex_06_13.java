package Ex06;

public class Ex_06_13 {
    public static void main(String[] args) {
        int i, k;

        for (i = 0; i < 3; i++){        // i는 0 1 2 총 3번 반복합니다.
            for (k = 0; k < 2; k++) {   //k는 0 1 총 2번 반복합니다.
                System.out.printf("중첩 for 문입니다. (i값 %d, k값 %d)\n", i, k);
                // i 는 00 11 22. 즉 0 1 2 로 반복되었고, k는 01 01 01. 즉 01 로 2번 반복을 i로 인해 3번 똑같이 반복하였다.
            }
        }
    }
}
