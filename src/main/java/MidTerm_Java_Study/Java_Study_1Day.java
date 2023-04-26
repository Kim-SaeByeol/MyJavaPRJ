package MidTerm_Java_Study;
//23.04.09 (일요일)    데이터타입 간에 계산.
public class Java_Study_1Day {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        char d = '일', e = '이', f = '삼';
        String j = "영점일", k = "영점이", l = "영점삼";
        double n = 0.1, m = 0.2;
        char y = 1;

        System.out.println((int) d + "정수 d");
        System.out.println((int) e + "정수 e");
        System.out.println((int) (d + e)  + "정수 e + d");
        System.out.println(d + e);
        System.out.println((char)('일' + '이'));
        System.out.println(y);
        System.out.println();



        //정수 + x
        System.out.println("정수 에 무언가를 더 해보자");
        System.out.println(a +b + d);      // 정수 + 문자           = 정수 + 아스키코드
        System.out.println(a + b + j);      // 정수 + 문자열         = (정수)+ 문자열
        System.out.println(a + b + n);      //정수 + 실수           = 실수
        System.out.println();

        //문자 + x
        System.out.println("문자 에 무언가를 더 해보자");
        System.out.println(d  + e + a + b);     //문자 + 정수       = 정수
        System.out.println(d + e + j + k);      //문자 + 문자열      = 정수 + 문자열 ==> 문자 + 문자 = 아스키코드 + 아스키코드
        System.out.println(d + e + n + m);      //문자 + 실수
        System.out.println();

        //문자열 + x
        System.out.println("문자열 에 무언가를 더 해보자");
        System.out.println(j + k + a + b);      //문자열 + 정수
        System.out.println(j + k + d + e);      //문자열 + 문자
        System.out.println(j + k + n + m);      //문자열 + 실수
        System.out.println();

        //실수 + x
        System.out.println("실수 에 무언가를 더 해보자");
        System.out.println(n + m + a + b);      //실수 + 정수
        System.out.println(n + m + d + e);      //실수 + 문자
        System.out.println(n + m + j + k);      //실수 + 문자열
        System.out.println();

        System.out.println((int)'a');
    }
}
