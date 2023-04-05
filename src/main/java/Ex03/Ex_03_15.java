package Ex03;

public class Ex_03_15 {
    //Pg_121
    public static void main(String[] args) {
        String str1 = "IT CookBook 입니다.";       //문자열 타입 변수 str1 에 문자열 저장. 문자열은 "".
        String str2 = "10";     //문자열 10 저장. 정수10이 아닌 문자열 10.
        String str3 = "20";     //문자열 20 저장.

        str1 = "Java 입니다.";     //문자열 초기화 후 새로운 문자열 저장.
        System.out.printf("%s \n", str1);       //str1 은 "Java 입니다."
        System.out.printf("%s \n", str2 + str3);    //숫자 10 20이 아닌 문자열 10 20 이기에 문자열 1020이 나온다.
    }
}
