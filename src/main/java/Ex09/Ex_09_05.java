package Ex09;

import java.util.Scanner;

public class Ex_09_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, strRep, strRep2, strSub, strAry[];

        System.out.printf("문자열을 입력하세요 : ");
        str = sc.nextLine();

        strRep = str.replace(" ", "$");
        strRep2 = str.replaceAll("\\s", "\\%");

        //substring(int beginIndex 시작위치, int endIndex마지막 위치)
        //시작위치 부터 마지막 위치 까지 존재하는 문자열을 반환한다.
        strSub = str.substring(3, 8);

        //split(String regex)
        //정규표현식 regex를 기준으로 문자열을 분할한다.
        strAry = str.split(" ");

        System.out.println("입력 문자열 ==>" + str);
        System.out.println("바꾼 문자열 ==>" + strRep);
        System.out.println("바꾼 문자열 ==>" + strRep2);
        System.out.println("일부 문자열 ==>" + strSub);


        for(int i = 0; i < strAry.length; i++)
            System.out.println("분리한 문자열" + i + "==>" + strAry[i]);
    }
}
