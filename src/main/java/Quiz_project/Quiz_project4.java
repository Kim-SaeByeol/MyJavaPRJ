package Quiz_project;

public class Quiz_project4 {
    public static void main(String[] args) {
        int result;
        System.out.printf("");
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                result = j * i;
                System.out.printf("%d*%d=%d\t", j, i, result);
            }
            System.out.printf("\n");
        }
    }
}