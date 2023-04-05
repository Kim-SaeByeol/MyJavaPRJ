package Quiz_project;

public class Quiz_project5 {
    public static void main(String[] args) {
        int i, k = 2, result;       //데이터타입 정수인 변수 i k result 선언. k = 2도 함께 선언.
        for (i = 1; i < 10; i++) {      // i 는 1부터 10까지 +1 씩 늘어나는데 <10 이므로 1 2 3 4 5 6 7 8 9 총 9번 반복함.
            result = i * k;     //결과 값을 출력하기 위해 result 정수타입 변수에 i * k 라는 식을 저장함.
            System.out.printf("%d*%d=%d\t",k,i,result);
            //printf 를 썼기에 형식을 지정하고 변수를 넣었다. %d %d %d 를 순서대로 k i result 가 들어가 결과값을 출력한다.
            //만약 printf 가 아닌 print 를 쓴다면 print(k + '+' + i + '=' + result) 로 쓸 수 있다.
            //  /t은 tap 키를 쓴다는 의미로 출력을 깔끔하게 하기 위해 넣었다.
            if (i == 9 && k < 9) {
                // k는 지금 앞자리 곱셈의 자리이고, i 는 뒷자리 곱셈의 자리인데
                // k++ 가 아래에 위치하여 있기에 k<9 로 지정하여 k가 ++를 받아 9를 받게 하였다.
                // i = 0 으로 바꾸어 for문의 i의 값을 재설정 함으로 무한루트 를 만들었고 k = 9 가 됨에 따라 무한루트를 벗어난다.
                i = 0;
                k++;
                System.out.println();
            }
                //2320110184 김새별
        }
    }
}