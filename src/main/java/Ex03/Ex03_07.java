package Ex03;

public class Ex03_07 {
    //Pg 100
    public static void main(String[] args) {
        int a;
        float b;

        /*
        프로그래밍 언어는 우리가 생각하는 a = b 를 다르게 표현한다.
        우리는 a = b 를 a 는 b 다 혹은, a는 b와 같다. 라고 표현하지만,
        프로그래밍 언어는 a = b 를 a에 b의 값을 저장하라~ 라고 표현한다.
        우리의 a = b 를 프로그래밍 언어는 a == b 라고 표현한다.
         */

        a = (int) 123.45f;          //(int) 를 쓰므로 실수 ㅡ> 정수로 형 변환.
        b = 200;                    //float(실수) 변수에 정수인 200을 넣었으니 자동으로 정수 ㅡ> 실수로 형 변환.

        System.out.printf("a의 값 ==> %d \n", a);     // "" 안의 값은 출력. %d 는 하나의 변수와 같음.
        System.out.printf("b의 값 ==> %f \n", b);
    }
}
