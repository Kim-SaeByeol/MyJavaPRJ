package Study_Myself;

import java.util.Scanner;

public class Quize_String {

    static void index (String sentence, String indexValus){

        int index = sentence.indexOf(indexValus);
        System.out.println(sentence.substring(index, indexValus.length()));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";
        String st[] = log.split(" ");

        //1번 문제. IP만 출력함.
        System.out.println(st[0]);

        //2번 문제, 순서대로 봐서 GET 이라는 문자가 있으면 출력할 것.
        index(log, "GET");

        for( ; ; ){
            System.out.println("문장을 입력해주세요");
            String sentence = sc.next();
            String split[] = sentence.split("[, .]");
            System.out.println("입력하신 문장");
            for (String i : split){
                System.out.println(i + "\n");
            }
            System.out.print("해당 문장에서 찾고 싶은 문장을 입력해주세요 : ");
            String indexValus = sc.next();
            index(sentence, indexValus);
        }
    }
}
