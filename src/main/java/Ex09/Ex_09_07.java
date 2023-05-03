package Ex09;

public class Ex_09_07 {
    public static void main(String[] args) {
        String str = "    한글  ABCD  ofgh   ";
        String result = "";


        //charAt() 메소드는 (인덱스) 의 값을 반환함.
        //공백이 아니면 result에 저장하기에 공백을 제외한 값이 저장됨.
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' ')
                result += str.substring(i, i+1);
        }
        System.out.println("원 문자열 ==> [" + str + "]");
        System.out.println("공백제거 ==> [" + result + "]");
    }
}