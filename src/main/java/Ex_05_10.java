import java.util.Scanner;

public class Ex_05_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.printf("출생년도를 입력하세요 : ");
        year = sc.nextInt();

        switch (year%12) {      //입력 값 year 을 12로 나눈 나머지 값이 결과.
            case 0 :    //스위치 결과 값이 0일 시 실행
                System.out.printf("원숭이띠");
                break;
            case 1 :    //스위치 결과 값이 1일 시 실행
                System.out.printf("닭띠");
                break;
            case 2 :    //스위치 결과 값이 2일 시 실행
                System.out.printf("개띠");
                break;
            case 3 :    //스위치 결과 값이 3일 시 실행
                System.out.printf("돼지띠");
                break;
            case 4 :    //스위치 결과 값이4일 시 실행
                System.out.printf("쥐띠");
                break;
            case 5 :    //스위치 결과 값이 5일 시 실행
                System.out.printf("소띠");
                break;
            case 6 :    //스위치 결과 값이 6일 시 실행
                System.out.printf("호랑이띠");
                break;
            case 7 :    //스위치 결과 값이 7일 시 실행
                System.out.printf("토끼띠");
                break;
            case 8 :    //스위치 결과 값이 8일 시 실행
                System.out.printf("용띠");
                break;
            case 9 :    //스위치 결과 값이 9일 시 실행
                System.out.printf("뱀띠");
                break;
            case 10 :   //스위치 결과 값이 10일 시 실행
                System.out.printf("말띠");
                break;
            case 11 :   //스위치 결과 값이 11일 시 실행
                System.out.printf("양띠");
                break;
            default:
        }
    }
}
