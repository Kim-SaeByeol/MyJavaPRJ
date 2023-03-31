public class Quiz_project5 {
    public static void main(String[] args) {
        int i, k = 2, result;
        for (i = 1; i < 10; i++) {
            result = i * k;
            System.out.printf("%d*%d=%d\t",k,i,result);
            if (i == 9 && k <= 8) {
                i = 0;
                k++;
                System.out.println();
            }
                //2320110184 김새별
        }
    }
}
