package Ex09;

import java.util.Scanner;

public class Ex_09_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.printf("문자열 ==> ");
        str = sc.nextLine();

        System.out.printf("출력 문자열 ==> ");

        if(!str.startsWith("("))
            System.out.printf("(");

        for(int i = 0; i < str.length(); i++)
            System.out.printf("%c", str.charAt(i));

        if(!str.endsWith(")"))
            System.out.printf(")");

        //startWith 와 endsWith
        //starWith 는 첫번째 문자에 대한 true false 를 뜻하고,
        //endsWith 는 마지막 문자에 대한 true false 를 뜻한다.
        //맞으면 true, 틀리면 false.
    }
}
