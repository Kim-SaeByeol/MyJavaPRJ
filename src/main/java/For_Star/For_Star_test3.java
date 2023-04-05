package For_Star;

public class For_Star_test3 {
    /*
    별로 ▶ 모양 찍기.
     */
    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i ++){
            for (j = 0; j < 5; j++) {
                if (j <= i)
                    System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i <= j)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}