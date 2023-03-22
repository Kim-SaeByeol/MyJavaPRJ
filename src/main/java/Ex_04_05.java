public class Ex_04_05 {
    //Pg_141
    public static void main(String[] args) {
        int a = 100, b = 200;

        // true 와 flase는 문자열이기 때문에 %s로 출력 되게 한다.
        System.out.printf("%d == %d 는 %s 이다.\n", a, b, a == b);     //== 은 같으면 true 다르면 false. 100과 200은 같지 않으므로 false.
        System.out.printf("%d != %d 는 %s 이다.\n", a, b, a != b);     // != 는 다르다. 100 과 200은 다르므로 true.
        System.out.printf("%d > %d 는 %s 이다.\n", a, b, a > b);       // a > b. 100 > 200 은 결과값이 '거짓' 이므로 flase.
        System.out.printf("%d < %d 는 %s 이다.\n", a, b, a < b);       // a < b. 100 < 200 은 결과값이  '참' 이므로 true.
        System.out.printf("%d >= %d 는 %s 이다.\n",a, b, a >= b);      // a >= b. 100 >= 200 은 결과값이 '거짓' 이므로 flase.
        System.out.printf("%d <= %d 는 %s 이다.\n", a, b, a <= b);     // a <= b. 100 <= 200 은 결과값이 '참' 이므로 true.

        System.out.printf("%d = %d는 %s 이다.\n", a, b, a = b);
        //==를 쓰는 이유. a = b 를 했기에 "a 에 b의 값을 넣어라" 라는 연산자가 작동하여 a = 200 으로 출력이 되었다.
    }
}
