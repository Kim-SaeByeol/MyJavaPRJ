public class For_Star_test2 {
    /*
    별 계단 찍기.
     */
    public static void main(String[] args) {
        int i, j;
        for(i = 0; i < 5; i++){
            for (j = 0; j<5; j++){
                if(j <= i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
