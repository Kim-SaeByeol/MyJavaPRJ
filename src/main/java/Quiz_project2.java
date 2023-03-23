import java.util.Scanner;
public class Quiz_project2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("입력 값 : ");
        a = sc.nextInt();
        System.out.println("출력결과");
        if (a%3 == 0  || a%5 ==0) {
            if (a%3 == 0 && a%5 == 0) {
                System.out.println("3의 배수와 5의 배수를 둘다 만족합니다.");
            }
            else if(a%3 ==0) {
                System.out.println("3의 배수입니다.");
            }
            else if (a%5 == 0) {
                System.out.println("5의 배수입니다.");
            }
        } else {
            System.out.println("3과 5의 배수가 아닙니다.");
        }
            //2320110184 김새별

    }
}