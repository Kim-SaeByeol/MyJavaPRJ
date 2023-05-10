package Ex10;

public class Ex_10_03 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try {
            result = a / b;
        }catch (ArithmeticException e){
            System.out.println("발생오류");
            System.out.println("e.getMessage() :  \n" + e.getMessage() + "\n");
            System.out.println("e : \n" + e);

            System.out.println("e 는 오류의 패키지도 포함해서 알려주고 e.getMessage()는 e클래스 내부의 Message() 내용을 출력한다.");
        }

    }
}
