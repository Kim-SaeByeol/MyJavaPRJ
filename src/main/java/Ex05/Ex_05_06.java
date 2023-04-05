package Ex05;

import java.util.Scanner;       //스캐너를 사용하기 위해 사용할 스캐너 명령어가 어디에 있는지 import 문으로 선언하였다.

public class Ex_05_06 {
    //Pg 174
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);     //스캐너를 s 라는 변수에 객체로써 지정하였다.
        /*
        Scanner s = ~~ 는 변수를 지정하는 것과 비슷한데,
        Scanner 는 대문자로 시작하는 데이터타입(import문으로 받아온 파일)으로 자바 파일에 속해있음을 알 수 있다.
        또한, 프로그램은 메모리에 올라가야 작동이 되는데, 기본 데이터타입은 지정과 함께 값을 넣으면 바로 올라가는데 반해 ex) int a = 100;
        지정하는 데이터 타입 (맨 앞이 대문자일 경우)들은 new 라는 선언한다 라는 뜻의 선언이 필요하다.
         */

        int a;
        //맨 앞이 소문자로 시작하는 int. 기본 데이터타입. int a = 100; 같은 변수 지정을 바로 가능하게 하는 것은 기본 데이터타입 이기 때문이다.

        System.out.printf("정수를 입력하세요 : ");      //입력 받기 전에 어떤 범위로 입력 받을지 알려준다.
        a = s.nextInt();        // a에 입력 받을 값은 nextInt(). 즉 정수 int 값을 받고 저장한다.


        if(a%2 == 0) {          //나머지 값이 없으면 짝수 이기에 짝수 범위를 지정했다.
            System.out.printf("짝수를 입력했군요..\n");
        }else {                 //짝수가 아니라면 나머지가 생기는 홀수이기에 짝수가 아니라면 홀수이다.
            System.out.printf("홀수를 입력했군요..\n");
        }
    }
}
