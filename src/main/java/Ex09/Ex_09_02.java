package Ex09;

import java.util.Scanner;

public class Ex_09_02 {
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

            //charAt(int index) ==> 인덱스의 문자를 반환.
            //문자열의 인덱스는 0부터 시작하며 해당 로직은
            //해당 인덱스의 값이 'o' 일시 '$'가 출력되는 로직이다.
            //문자열은 문자의 나열이므로, char 값의 모음이다.
        }
    }
}
