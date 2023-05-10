package Ex09;

public class Ex_09_13 {
    static int plus(int v1, int v2){
        int result;
        result = v1 + v2;
        return result;
    }

    static String colc(String a, String b){
        String st = a + b;
        return st;
    }
    public static void main(String[] args) {
        int hap;
        hap = plus(100, 200);
        System.out.println(colc("1", "2"));
        System.out.printf("100과 200의 plus() 메소드 결과는 : %d\n", hap);
    }
}
