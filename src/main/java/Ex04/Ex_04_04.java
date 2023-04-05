package Ex04;

public class Ex_04_04 {
    //Pg_139
    public static void main(String[] args) {
        int a = 10, b;
        b = a++;        // a++ 는 후에 계산한다는 뜻이므로 b = 10.          a++. 가장 나중에 실행해!
        System.out.printf("%d \n", b);  //b = 10. a = 11.
        b = ++a;        // ++a 는 먼저 계산한다는 뜻이므로 b += 11. b = 12.     ++a. 가장 먼저 실행해!
        System.out.printf("%d \n", b);  //b= 12. a= 12.
    }
}
