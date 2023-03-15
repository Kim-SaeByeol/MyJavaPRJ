public class Ex03_08 {
    //Pg 101
    public static void main(String[] args) {
        int a, b;               //int(정수형) 데이터 타입으로 변수 a, b 선언.
        float c, d;             //float (실수형) 데이터 타입으로 변수 c, d 선언.

        a = 100;                // a = 100 임을 선언.
        b = a + 100;            // b = a + 100 = 100 + 100 임을 선언.

        c = 111.1f;             // c = 111.1f 임을 선언. f는 float의 약자로, float 타입임을 뜻함.
        d = a;                  // d = a = 100 임을 선언. d는 실수형 임으로 int 형인 a = 100을 자동으로 float 형식으로 바꿔서 저장. 즉 100.000000

        System.out.printf("a, b의 값 ==> %d, %d \n", a, b);               //정수 a b 를 출력한다.
        System.out.printf("c, d의 값 ==> %5.1f, %5.1f \n", c, d);         //실수 c 와 d 를 출력하는데, 5자리에 소숫점 아래는 1로 하여 출력한다.
    }
}
