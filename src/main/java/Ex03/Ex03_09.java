package Ex03;

public class Ex03_09 {
    //Pg 102
    public static void main(String[] args) {
        int a, b, c, d;         //int (정수형) 데이터형식에 a, b, c, d 라는 변수 선언.

        a = 100+100;            // a = 100 + 100 = 200 이라고 변수의 값 초기화.
        b = a + 100;            // b = a + 100 = 200 + 100 이라고 변수의 값 초기화.
        c = a + b - 100;        // c = a + b - 100 = 200 + 300 - 100 이라고 변수의 값 초기화
        d = a + b + c;          // d = a + b + c = 200 + 300 + 400 이라고 변수의 값 초기화.
        System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d \n", a, b, c, d);   // a, b, c , d 의 값을 표현하고, \n. 행을 바꿨다.

        a = b = c = d = 100;    //기존의 있던 a, b, c, d의 변수값을 100으로 초기화.
        System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d \n", a, b, c, d);  // a, b, c , d 의 값을 표현하고, \n. 행을 바꿨다.

        a = 100;                // a = 100 으로 재차 선언.
        a = a +200;             // a = a + 200 = 100 + 200 이라고 변수의 값을 초기화.
        System.out.printf("a의 값 ==> %d \n", a);     // a = 300 이므로 300을 출력합니다.
    }
}
