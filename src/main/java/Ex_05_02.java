public class Ex_05_02 {
    //Pg 169
    public static void main(String[] args) {
        int a = 200;
        if (a<100)
            System.out.printf("100보다 작군요..\n");     //if문에 범위지정이 없기 때문에 '바로 아래에 있는 한줄' 만 if 문이라고 인식했다.
        System.out.printf("거짓이므로 이 문장은 안보이겠죠? \n");

        System.out.printf("프로그램 끝!\n");

    }
}
