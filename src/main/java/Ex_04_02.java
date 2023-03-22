public class Ex_04_02 {
    //Pg_134
    public static void main(String[] args) {
        int a = 2, b = 3, c =4;
        int result1, mok, namugi;
        float result2;

        result1 = a + b - c;
        System.out.printf("%d + %d - %d = %d \n", a, b, c, result1);

        result1 = a + b * c;
        System.out.printf("%d + %d * %d = %d\n", a, b, c, result1);

        result2 = a * b /(float) c;     //소숫점을 표현하기 위해 실수형 데이터타입(float)으로 강제변환 했다.
        System.out.printf("%d * %d / %d = %f\n", a, b, c, result2);

        mok = c / b;
        System.out.printf("%d / %d 의 몫은 %d \n", c, b, mok);
        namugi = c % b;
        System.out.printf("%d / %d 의 나머지는 %d \n", c, b, namugi);
    }
}
