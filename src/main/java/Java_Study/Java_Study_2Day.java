package Java_Study;
//if 문과 for문에 대하여
public class Java_Study_2Day {
    public static void main(String[] args) {
        if(true) {
            System.out.println("if절에는 boolear 값인 true 와 false 의 값이 들어가야됨.");
            int i = 0;
            for (; ;) {
                System.out.println(i + "번 반복중");
                i++;
                if(i == 10)
                    break;
            }
            System.out.println("1~5 출력하는데 2는 출력하지마");
            for( i = 1; i<5; i++){
                if(i == 2)
                    continue;
                System.out.println(i);
            }
            for (i = 0; i<3; i++){
                for (int j = 1; j<3; j++)
                    System.out.println("i 는 현재 :" + i + "이고, j는 현재 : " + j +"입니다.");
            }
            System.out.println("증감식을 1의 크기가 아니라 더 크게 잡을 수도 있음. ");
            for(i = 10; i > 1; i -= 2){
                System.out.println("현재 i는 :" + i);
            }
        }
        int a = 0;
        if(false) {
            System.out.println("false 라면 출력되지 않음.");
        }
        System.out.println("{}의 범위를 항상 잘 보고 {} 안에서 선언한 변수는 해당 {} 안에서만 유효하다는 것을 인지하자.");

    }
}
