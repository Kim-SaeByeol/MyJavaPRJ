public class Ex_07_05 {
    public static void main(String[] args) {
        int a = 100;

        while (a == 200) {      //조건식이 맞지 않기 때문에 실행되지 않음.
            System.out.printf("while 문 내부에 들어 왔습니다.\n");
        }
        do {        //do 는 우선 실행하는 친구. 그래서 실행함.
            System.out.printf("do - while 문 내부에 들어 왔습니다.");

            }while (a == 200);  //while 의 조건문이 맞다면 do 가 다시 실행됨. 그 이후 다시 조건문을 봄.
    }
}
