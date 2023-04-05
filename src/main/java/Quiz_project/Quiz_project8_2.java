package Quiz_project;

public class Quiz_project8_2 {
    //while 문 1개만 써서 구구단 찍기. 변수도 1개만 써보자.
    public static void main(String[] args) {
        int i = 18;
        while (i < 90){
            System.out.printf("%d X %d = %d\n", i/9 , i%9+1, (i/9) * (i%9+1));
            i ++;
        }
    }
}
