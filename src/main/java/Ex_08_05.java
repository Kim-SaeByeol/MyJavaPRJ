public class Ex_08_05 {
    public static void main(String[] args) {
        int[] aa = new int[100];        //100칸 짜리 정수형 배열 aa
        int bb[] = new int[100];        //100칸 짜리 정수형 배열 aa
        int i;

        //aa[] 에 0~99 까지 i*2 의 값을 넣음.
        for (i = 0; i<100; i++) {
            aa[i] = i*2;
        }
        //bb[] 에 0~99 까지 aa[] 의 역순값을 넣음.
        for (i = 0; i<100; i++)
            bb[i] = aa[99-i];
        System.out.printf("bb[0]는 %d, bb[99]는 %d 입력됨\n", bb[0], bb[99]);
    }
}
