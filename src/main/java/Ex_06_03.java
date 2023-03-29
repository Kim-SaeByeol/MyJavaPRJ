public class Ex_06_03 {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 3; i++) {            // { } 안의 영역을 i < 3 만큼 실행
            System.out.printf("안녕하세요? \n");
            System.out.printf("##또 안녕하세요? ## \n");
        }
        System.out.printf("\n\n");

        for(i = 0; i < 3; i++)      //바로 아래 한줄만 반복.
            System.out.printf("안녕하세요? \n");
            System.out.printf("##또 안녕하세요?## \n");

    }
}
