package Ex03;

public class Ex03_05 {
    // Pg 94
    public static void main(String[] args) {
        System.out.printf("%d\n", 123);
        //%d 는 숫자의 자릿수 만큼 정렬한다.
        System.out.printf("%5d\n", 123);
        //%5d 는 자릿수를 다섯(5) 자리로 확보한다. ㅁㅁ123 으로 저장함. 항상 우측부터 저장한다. ㅁㅁ는 공백.
        System.out.printf("%05d\n", 123);
        //%05d 는 다섯(5) 자리를 확보하며, 빈칸을 0 으로 채운다는 뜻이다. 00123.

        System.out.printf("%f\n", 123.45);
        // %f 는 숫자의 자릿수 만큼 정렬하는데, 소수를 포함하여 정렬한다. 여기서, 소수점 아래는 무조건 여섯자리수 까지 출력한다. 123.450000.
        System.out.printf("%7.1f\n", 123.45);
        //%7.1f 는 일곱(7)자리를 확보하는데, 소수점 아래를 1칸만 (0.1) 확보한다. 확보를 위해 둘째자리수 부터는 반올림한다. 123.5
        System.out.printf("%7.3f\n", 123.45);
        //7.3f 이므로 일곱(7자리) 확보, 소수점 아래는 3칸 (0.3)만 확보. 만일, 0.Xf 가 있다면 반드시 둘째 자리 부터는 반올림한다. 남는 공간은 공백. 123.450

        System.out.printf("%s\n", "Hi-JAVA");
        //%s 는 문자열(String) 을 저장한다. 문자열은 항상 "" 안에 써야한다.
        System.out.printf("%10s\n", "Hi-JAVA");
        //%10s 는 10자리 확보를 하고 출력한다는 뜻이다. ㅁㅁㅁHi-JAVA .
    }
}