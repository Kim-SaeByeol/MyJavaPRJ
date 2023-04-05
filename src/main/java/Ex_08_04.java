public class Ex_08_04 {
    public static void main(String[] args) {
        int aa[] = {100, 200, 300, 400};        // 정수형 배열 aa 에는 100, 200, 300, 400 이 저장된다. 즉, 인덱스 0 1 2 3 이 생성되기에 aa 배열은 총 4칸이다.
        int bb[] = new int[]{100, 200, 300};    // 정수형 배열 bb를 선언하는데, 선언과 동시에 값 100, 200, 300을 저장한다. 인덱스 0, 1, 2 자리에 넣었기에 배열은 총 3칸이다.

        int cc[];       // 정수형 타입 배열 cc.
        cc = new int[]{100, 200};  //cc 에 100 200 을 저장한다. 인덱스 0, 1 을 사용하였기에 배열은 2칸.
        int[] dd = new int[1];      //1칸짜리 정수형 배열 dd 선언.
        dd[0] = 100;    //1칸에 100을 저장한다. 인덱스는 0.
        int i;

        //배열의 갯수를 나타내는  "배열이름.length"
        System.out.printf("aa[]의 배열 갯수는 ==> %d\n",aa.length);
        System.out.printf("aa[]의 배열 갯수는 ==> %d\n",bb.length);
        System.out.printf("aa[]의 배열 갯수는 ==> %d\n",cc.length);
        System.out.printf("aa[]의 배열 갯수는 ==> %d\n",dd.length);

        for (i = 0; i < 4; i++)    //0~3 까지 반복. 총 3회 반복.
            System.out.printf("aa[%d] ==> %d\t", i, aa[i]);     //aa[] 에 뭐가 있는지 출력함. 인덱스 0, 1, 2, 3 에 저장된 값들 출력.
        System.out.printf("\n");
        for (i = 0; i < 2; i++)       //0~2 까지 반복. 총 2회 반복.
            System.out.printf("cc[%d] ==> %d\t", i, cc[i]);     //cc[] 에 뭐가 있는지 출력함. 인덱스 0, 1,에 저장된 값들 출력.
        System.out.printf("\n");
    }
}
