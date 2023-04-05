package Ex04;

public class Ex_04_06 {
    //Pg 143
    public static void main(String[] args) {
        int a = 99;
        System.out.printf("AND 연산 : %s\n", (a>100) && (a <= 200) );     // a = 99. 99> 100 = false. 99 <= 200 = true. 둘다 true 가 아니므로 결과는 false.
        //AND 연산 &&. 둘다 같으면 true. '하나라도' 틀리면 flase.

        System.out.printf("OR 연산 : %s\n", (a>=100) || a <200);      //a = 99. 99>= 100 = false. 99 < 200 = true. 하나라도 true 이므로 true.
        //OR 연산 ||. 하나라도 true 이라면 true.

        System.out.printf("NOT 연산 : %s\n", !(a==100));      //a=99. 99 = 100 = false. !(a==100) = !(false) = true.
        //NOT 연산 !. 결과값을 반대로. true 라면 false로, false 라면 true 로.
    }
}
