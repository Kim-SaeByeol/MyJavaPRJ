public class Ex_06_15 {
    public static void main(String[] args) {
        int i, k;
        for(i = 1; i <= 9; i++) {       //1 ~ 9 반복
            for(k = 2; k <= 9; k++){    //2 ~ 9 반복
                System.out.printf("%3dX%d=%2d",k, i, k*i);  // k는 2~9. i는 1~9. i는 고정된 채로 k가 9까지 나오면 i++. i가 9일때 까지 반복.
            }
            System.out.printf("\n");    //k가 9가 되어 for문을 벗어나면 행을 바꾸고 i for문으로 다시 들어감.
        }
    }
}
