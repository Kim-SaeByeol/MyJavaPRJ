package Ex07;

public class Ex_07_13 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for (i = 1; i <= 100; i++)
            hap += i;

        System.out.printf("1부터 100까지의 합은 %d 입니다.\n", hap);

        if(hap > 5000)
            return;     //리턴문을 만났기에 프로그램이 종료됨.

        System.out.printf("프로그램이 끝입니다.");
    }
}
