package Ex07;

public class Ex_07_01 {
    public static void main(String[] args) {
        int i;
        i = 0;

        while (i < 5) {     //i < 5 일때 까지 반복. i = 0 이기에 0 1 2 3 4 총 5번 반복한다.
            System.out.printf("while문을 공부합니다.\n");
            i++;    // for문 처럼 i 의 값을 늘려주어 무한루프가 안 되도록 한다.
        }
    }
}
