package Ex09;

public class Ex_09_06 {
    public static void main(String[] args) {
        String str = "   한글  ABCD  efgh  ";

        System.out.println("원 문자열 ==> [" + str + "]");

        //toUpperCase() 는 영문자를 대문자로 바꾸는 메소드
        System.out.println("대문자로 ==> [" + str.toUpperCase()+ "]");

        //toLowerCase() 는 영문자를 소문자로 바꾸는 메소드
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");

        //trim() 메서드는 문자열의 앞뒤 공백을 제거한 새로운 문자열을 반환
        System.out.println("공백제거 ==> [" + str.trim() + "]");

    }
}
