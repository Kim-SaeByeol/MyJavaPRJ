package Ex09;

import java.util.Scanner;

public class Ex_09_02_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.printf("문자열 입력 ==> ");
        str = sc.nextLine();

        System.out.printf("출력 문자열 ==> ");
        for(int i = 0; i <str.length(); i++){
            if(str.charAt(i) == 'o')
                System.out.printf("%c", '$');
            else
                System.out.printf("%c", str.charAt(i));
        }
        System.out.println();

        //replace(CharSequence target, CharSequence replacement)
        //replace는 target 문자열을 replacement 문자열로 바꾸는 메소드이다.

        //replaceAll(String regex, String replacement)
        //replaceAll은 정규표현식으로 표현된 문자열을 정규표현식인 replacement로 바꾸는 메소드 이다.

        //replace 와 replaceAll 의 차이점은
        //replace는 타겟 즉, 하나의 단어만을 바꿀 때 사용되고,
        //replaceAll은 정규표현식 전체를 바꿀 때 사용된다.
        System.out.println("내가 사용한 함수 : " + str.replaceAll("o", "\\$"));
    }
}
