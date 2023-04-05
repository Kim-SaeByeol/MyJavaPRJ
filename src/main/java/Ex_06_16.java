public class Ex_06_16 {
    public static void main(String[] args) {
        int i, k;
        for(i = 1, k =1; i<=9; i++, k++)    //i 와 k 는 1로 시작해서 i <= 9 일때 까지 i++, k++ 한다.
            System.out.printf("%d X %d = %d\n", i, k, i*k); //i 와 k 가 1 일때 돌고, 2일때 돌고, 3일때 돌고 9일때 까지 나온다.
    }
}
