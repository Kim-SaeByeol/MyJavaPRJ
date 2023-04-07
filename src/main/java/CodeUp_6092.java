import java.util.Scanner;

public class CodeUp_6092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //학생 23명
        int std[] = new int[23];

        //발표를 시킬 학생 수
        int num = sc.nextInt();

        //학생 번호 호출
        for (int i = 0; i < num; i++){
            int num1 = sc.nextInt();

            //호출 받은 번호는 +1 씩 저장.
            std[num1 - 1]++;
        }
        //학생들의 호출 받은 횟수
        for (int i = 0; i < std.length; i++)
            System.out.print(std[i] + "  ");
    }
}
