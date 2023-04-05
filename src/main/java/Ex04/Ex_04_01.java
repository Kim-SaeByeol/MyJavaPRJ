package Ex04;

public class Ex_04_01 {
    //Pg_132
    public static void main(String[] args) {
        int a, b =5, c =3;      //변수 동시 선언.
        a = b + c;      // a = b + c 의 값은 저장.
        System.out.printf("%d + %d = %d\n", b ,c ,a);

        a = b - c;      // a = b - c 의 값을 초기화 한 후에 저장.
        System.out.printf("%d - %d = %d\n", b, c , a);

        a= b * c;       // a = b * c 의 값을 초기화 한 후에 저장.
        System.out.printf("%d * %d = %d \n", b, c, a);

        a = b / c;      // a = b / c 의 값을 초기화 한 후에 저장.
        System.out.printf("%d / %d = %d\n", b, c, a);

        a = b % c;      // a = b % c 의 값을 초기화 한 후에 저장.
        System.out.printf("%d %% %d = %d\n", b, c, a);
    }
}