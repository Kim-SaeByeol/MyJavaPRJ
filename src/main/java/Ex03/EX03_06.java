package Ex03;

public class EX03_06 {
    //Pg95
    public static void main(String[] args) {
        System.out.printf("\n줄바꿈\n 연습");                  //다음 행으로 이동합니다.
        System.out.printf("\t탭키\t 연습 \n");                // tab 을 친 것과 같은 효과.
        System.out.printf("이것을\r덮어씁니다 \n");             // \r 은 바로 뒤 문자열을 맨 앞으로 이동시키는데 이때 문자열 크기 만큼 있던 다른 문자열은 사라진다.
        System.out.printf("글자가 \"강조\"되는 효과 \n");        // \" 는 " 를 출혁한다.
        System.out.printf("\\\\\\ 역슬래시 세개 출력 \n");      // \\ 두개를 하면 역슬래시 1번.
    }
}
