package Study_Myself;

public class Test_Quiz_String {
    public static void main(String[] args) {
        String log ="123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        String str[] = log.split(" ");

        System.out.println(str[0]);


        String ch = "GET";
        int index = log.indexOf(ch);
        System.out.println(log.substring(index, index + ch.length()));

    }
}
