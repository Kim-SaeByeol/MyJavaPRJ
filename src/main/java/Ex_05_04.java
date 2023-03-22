public class Ex_05_04 {
    //Pg 172
    public static void main(String[] args) {
        int a = 200;

        if (a < 100)
            System.out.printf("100보다 작군요..\n");     //괄호가 없지만 바로 아래 내용이 false 이므로 무시 되었다.
        else
            System.out.printf("100보다 크군요..\n");
    }
}
