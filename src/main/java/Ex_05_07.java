public class Ex_05_07 {
    public static void main(String[] args) {
        int a = 75;


        if (a > 50) {       //a 의  값이 50 초과일 때 실행.
            if (a < 100) {  //a의 값이 100 미만일 때 실행
                System.out.printf("50보다 크고 100보다 작군요. \n");
            } else {    //a 의 값이 100보다 크면 실행
                System.out.printf("와~ 100보다 크군요..\n");
            }
        } else {    //if a > 50이 false. 즉 50보다 작으면 실행.
            System.out.printf("에게 50보다 작군요 ");
        }
    }
}
