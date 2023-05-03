package Ex09;

public class Ex_09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.printf("문자열 ==> + %s\n", str);

        System.out.printf("제일 처음 나오는 Java 위치 ==> ");
        System.out.printf("%d\n", str.indexOf("Java"));
        System.out.printf("마지막에 나오는 Java 위치 ==> ");
        System.out.printf("%d\n", str.lastIndexOf("Java"));
    }
    //indexOf()는 문자열 또는 문자의 첫 번째 발생 위치를 반환한다.
    //만약 찾으려는 문자열 또는 문자가 없을 경우 -1을 반환한다.

    //lastIndexOf()는 문자열 또는 문자의 마지막 발생 위치를 반환한다.
    //만약 찾으려는 문자열 또는 문자가 없을 경우 -1을 반환한다.

}
