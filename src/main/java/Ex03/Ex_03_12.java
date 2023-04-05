package Ex03;

public class Ex_03_12 {
    // Pg_116
    public static void main(String[] args) {
        /*
        아스키코드
        0 ~ 9 는 10진수 48 ~ 57
        A ~ Z 는 10진수 65 ~ 90
        a ~ z 는 10진수 97 ~ 122 .
       첫 숫자와 끝 숫자는 알아둘 것.
         */
        char a, b, c, d, e;     //문자 타입의 변수 a b c d e.
        a = 'A';                //문자 타입이기에 '' 를 붙였다.
        System.out.printf("%c \t", a);      //%c. a를 문자타입으로 출력하라.
        System.out.printf("%d \n", (int) a);    //(int)a 를 정수로 강제변환해서 출력하라.

        b = 'a';        //문자 타입이기에 ''
        c = (char) (b+1);   //c는 (b+1)의 문자타입 결과값이다.
        System.out.printf("%c \t", b);  //b를 문자 타입으로 출력하라.
        System.out.printf("%c \n", c);
        //c 를 문자타입으로 출력하라. 이 경우 아스키코드 a 에 +1 을 한 후 다시 아스키코드로 변환하여 출력해준다. 아스키코드 a = 97, 아스키코드 98 은 b 이기에 a + 1 = 97 + 1 = 98. 즉 b가 출력된다.

        d = 90;
        System.out.printf("%c \n", d);  //d는 문자타입이기에 90은 아스키코드로 변환되어 아스키코드 90인 Z 를 출력한다.

        d = '가';    // 문자 는 한글자.
        e = (char) (d+1);   //d의 값에 +1. '가' 아스키코드에 +1
        System.out.printf("%d \t", (int)d); //문자 '가' 를 정수로 즉, 아스키코드로 표현하면 44032.
        System.out.printf("%c \n", e);     //아스키코드 44032 + 1 은 각.
    }
}
