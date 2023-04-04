import java.util.Scanner;

public class year {
        public static void main(String[] args) {
            int a ;
            Scanner sc = new Scanner(System.in);
            System.out.printf("년도를 입력하세요\n");
            a = sc.nextInt();
            if(a%4 ==0 && a%100 != 0)
                System.out.printf("%d년은 윤년입니다.\n", a);
            if (a%400 ==0)
                System.out.printf("%d년은 윤년입니다.\n", a);
            else
                System.out.printf("%d년은 윤년이 아닙니다.", a);
        }
    }

