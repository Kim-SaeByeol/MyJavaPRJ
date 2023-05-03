package Ex09;

public class Ex_09_08 {
    public static void main(String[] args) {
        String str1 = "Java Programing";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));
    }
}
