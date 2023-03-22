public class Ex_05_05 {
    //Pg 173
    public static void main(String[] args) {
        int a = 200;

        if (a < 100) {                  //true 이면 if 범위 실행.
            System.out.printf("100보다 작군요..\n");
            System.out.printf("참이면 이 문장도 보이겠죠?\n");
        } else {                        //false 이면 else 범위 실행.
            System.out.printf("100보다 크군요..\n");
            System.out.printf("거짓이면 이 문장도 보이겠죠? \n");
        }
        System.out.printf("프로그램 끝! \n");
    }
}
