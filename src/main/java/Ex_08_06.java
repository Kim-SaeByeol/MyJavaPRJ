public class Ex_08_06 {
    public static void main(String[] args) {
        //aa[] 에 10, 20, 30, 40, 50 을 넣어 총 0~4. 5칸의 배열을 선언함.
        int aa[] = {10, 20, 30, 40, 50,};
        int count, size;

        //aa[] 의 배열 갯수를 count 에 저장함. 0~4. 총 5칸 이므로 count = 5
        count = aa.length;
        //Integer.BYTES 는 바이트 크기를 계산하는 클래스 이다.
        // int 는 4바이트 이고, int 형 배열이 5개 있으므로, 4 X 5 = 20. 총 20 바이트의 크기가 aa[]에 할당 되어있다.
        size = count * Integer.BYTES;

        System.out.printf("배열 aa[]의 요소의 개수는 %d 개 입니다.\n", count);
        System.out.printf("배열 aa[]의 요소의 전체 크기는 %d 바이트입니다.\n", size);
    }
}
