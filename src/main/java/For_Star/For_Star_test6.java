package For_Star;

public class For_Star_test6 {
    /*
   별로 X 찍기.
     */
    public static void main(String[] args) {
        int i, j, k = 4;
        for (i = 0; i < 5; i++, k--) {
            for (j = 0; j < 5; j++) {
                if(i > j)
                    if(k == j)
                        System.out.print("*");
                    else
                    System.out.print(" ");
                    if(i==j) {
                    System.out.print("*");
                }
                 if(k > j && i < j)
                     System.out.print(" ");
                    if(k ==j && k > 2)
                        System.out.print("*");
            }
            System.out.println();
            //2320110184 김새별
        }
    }
}
