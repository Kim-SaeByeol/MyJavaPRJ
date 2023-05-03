package Ex09;

public class Ex_09_01 {
    public static void main(String[] args) {
        String str = "IT CookBook, Java";
        int len;

        //str.length() 는 String 클래스에서 제공하는 메소드 중 하나.
        //문자열의 길이를 알려준다.
        len = str.length();

        System.out.printf("문자열 : %s \n", str);
        System.out.printf("문자열 길이 : %d", len);
    }
}
