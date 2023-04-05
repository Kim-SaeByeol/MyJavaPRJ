package Ex03;

public class Ex03_04 {
    //Pg 91
    public static void main(String[] args) {
        System.out.printf("%d / %d = %f \n", 100, 200, 0.5);        //%d 가 2개니, 정수 2개. %f 가 1개니, 실수(float) 1개.
        System.out.printf("%c %c \n", 'a', 'K');                    //%c 가 2개니 문자(char) 2개. 문자는 ' '를 쓴다. "\n" 이 있으니 행 이동~
        System.out.printf("%s %s \n", "IT CookBook", "JAVA");       //%s 가 2개니 문자열(String) 2개. 문자열은 " "를 쓴다.

        //실수 0.5 의 값이 0.5 가 아닌 0.500000 로 출력되는 이유는, 컴퓨터는 2진수로 받아들이고 출력하기 때문에 0.5 를 맞추기 위해 0000을 붙인 것이다.
    }
}
