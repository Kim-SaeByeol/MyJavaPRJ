package Ex03;

public class Ex03_11 {
    //Pg 114
    public static void main(String[] args) {
        float a = 0.1234567890123456789012345f;
        double b = 0.1234567890123456789012345;

        System.out.printf("%30.25f \n", a);
        //4바이트의 크기인 float은 소수점 아래 일곱자리 까지만 정확한 값이 출력되었다.
        System.out.printf("%30.25f \n", b);
        //8바이트의 크기인 double은 소수점 아래 열 일곱자리 까지만 정확한 값이 출력 되었다.

        /*
        데이터 타입은 자신이 처리할 수 있는 크기 만큼 처리하기 때문에,
        float은 처리 공간이 부족하여 처리 가능한 크기 만큼 처리 하였다.

        double 도 마찬가지인데 float 은 엉뚱한 값이 나온 반면,
        double은 17자리 까지 그대로 출력하고 19번째 값을 반올림하여 18번째에 출력하였다.

        즉, 소수점이 많은 경우 float 보다는 doble 을 쓰도록 하자.
        + double 은 실수의 기본형이며, 정수의 기본형은 int 이다.
        */
    }
}
