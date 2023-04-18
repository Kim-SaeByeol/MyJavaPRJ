import java.util.Random;

public class scheduling_random_math {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            for (int i = 1; i < 5; i++) {

                int waitTime = (int) (Math.random() * 20) + 1;
                int runTime = (int) (Math.random() * 30) + 1;
                int arrivalTime = (int) (Math.random() * 30);

                System.out.printf("<P%d> 대기시간 : %d, 실행시간 : %d, 도착시간 : %d\n", i, waitTime, runTime, arrivalTime);
            }
            System.out.println();
            System.out.println();
        }
    }
}
