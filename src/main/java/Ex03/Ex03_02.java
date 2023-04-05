package Ex03;

public class Ex03_02 {
    //Pg 88
    public static void main(String[] args) {
        System.out.printf("%d", 100, 200);      //%d(정수형) 이 1개 이기에 뒤에 100만 출력함.
        System.out.printf("\n");
        System.out.printf("%d %d", 100);        // %d(정수형) 이 2개 이기에 뒤에도 2개를 입력해야함. %d 값이 1개 이기에 error.
        System.out.printf("\n");
        System.out.printf("%d %d", 100, 200);   // 5번 행의 오류를 해결하려면 이와 같이 써야함.
    }
}
