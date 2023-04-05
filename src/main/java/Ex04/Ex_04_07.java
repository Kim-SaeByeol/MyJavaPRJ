package Ex04;

public class Ex_04_07 {
    //Pg 144
    public static void main(String[] args) {
        int num1 = 100, num2 = -200;

        boolean a = (num1 != 0);        //a = true
        boolean b = (num2 != 0);        //n = true


        System.out.printf("상수의 AND 연산 : %s \n", a && b);        //true and true. 두개 다 true 때 true. 결과 값은 true.
        System.out.printf("상수의 OR 연산 : %s \n", a || b);         //true or true. 하나라도 true 이면 true.
        System.out.printf("상수의 NOT 연산 : %s \n", !a);            //! 은 부정. 결과값을 반대로. a = true 이므로, 반대값인 false 출력.
    }
}
