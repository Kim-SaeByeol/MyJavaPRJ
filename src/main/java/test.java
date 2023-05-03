import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {


    public static void main(String[] args){
            //입력을 받아야 하기에 스캐너 선언
            Scanner sc = new Scanner(System.in);

            //정수 타입으로 list 선언.
            //입력 횟수를 알기에 최소 크기를 5로 잡았다.
            //미리 크기를 잡은 이유는 add를 통해 메모리에 계속해서 집어넣는 것은 부담이 크기 때문.
            List<Integer> list = new ArrayList<>(5);

            //중복 제거 및 리스트에 값 입력
            for(int i = 0; i < 5; i++) {
                int num = sc.nextInt();

                //중복 제거를 위한 check.
                //아래에서 중복을 true로 설정했기에
                //값을 false로 계속 초기화 해준다.
                boolean check = false;

                //범위를 list.size로 잡은 이유는 가변적 크기 이기에 값을 넣지 않으면
                //리스트의 사이즈가 계속 변동되어버려 사이즈로 잡아 최소한의 반복을 하게 한다.
                for(int j = 0; j < list.size(); j++){
                    if(list.get(j) == num){
                        //중복 이라면 true로 바꾸어 못 집어넣게 할 것이다.
                        check = true;
                        break;
                    }
                }
                //중복이 없다면(true는 중복이 있을 시) 리스트에 add. 입력 값을 집어넣는다.
                if(check == false)
                    list.add(num);
            }
        //리스트에 있는 값을 i에 모두 넘겨 출력한다.
        //데이터 타입이 Integer 인 것은 list의 데이터타입이 Integer 이기 때문이며,
        //Integer 대신 Object 도 올 수 있지만 Object 는 최상위 개체 이기에 가급적 맞는 타입을 넣는다.
        for(Integer i : list)
            System.out.print(i + " ");

        sc.close();
    }
}
