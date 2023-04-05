import java.util.Scanner;

public class Ex_07_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;

        do {        //do는 실행.
            System.out.printf("\n손님 주문하시겠습니까 ? \n");
            System.out.printf("<1>카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬래요 => ");
            menu = sc.nextInt();        //정수형 입력값을 menu 변수에 저장함.
            switch (menu) {     //정수타입 변수 menu 의 값에 따라 들어가는 case 가 달라짐.
                case 1:
                    System.out.printf("#카페라떼 주문하셨습니다.\n");
                    break;
                case 2:
                    System.out.printf("#카푸치노 주문하셨습니다.\n");
                    break;
                case 3:
                    System.out.printf("#아메리카노 주문하셨습니다.\n");
                    break;
                case 4:
                    System.out.printf("#주문 커피 준비하겠습니다.\n");
                    break;
                default:
                    System.out.printf("잘못 주문하셨습니다.");
            }
        }while (menu != 4);     //입력값이 4가 아니면 다시 실행. 4라면 do-while 문을 벗어남.
    }
}
