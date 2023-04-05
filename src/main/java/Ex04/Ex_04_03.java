package Ex04;

public class Ex_04_03 {
    //Pg_137
    public static void main(String[] args) {
        int a = 10;
        a++;            // a += 10. a = 11
        System.out.printf("a++ ==> %d \n", a);

        a--;            // a -= 11. a = 10
        System.out.printf("a-- ==> %d \n", a);

        a += 5;         // a += 5. a= 10 이기에 a = 10 + 5 = 15
        System.out.printf("a+=5 ==> %d \n", a);

        a -= 5;         // a -=5. a = 15 이기에 a = 15 - 5 = 10.
        System.out.printf("a -= 5 ==> %d \n", a);

        a *= 5;         // a = 10. a = 10 * 5 = 50.
        System.out.printf("a *= 5 ==> %d \n", a);

        a /= 5;         // a = 50. a = 50 / 5 = 10
        System.out.printf("a /= 5 ==> %d \n", a);

        a %= 5;         // a = 10. a = 10 % 5 = 0. %는 나머지 값이다.
        System.out.printf("a %%= 5 ==> %d \n", a);          // %% 는 \\와 마찬가지로 % 하나만 출력한다. %d %c 와 같이 데이터타입을 정할때 쓰므로 컴퓨터가 인식하기 위함.

    }
}
