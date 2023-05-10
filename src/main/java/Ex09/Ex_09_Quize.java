package Ex09;

public class Ex_09_Quize {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";
        //문제 IP만 출력하기.
        String str[] = log.split(" ");
        System.out.println(str[0]);

        //문제 호출날짜와 시간만 출력
        System.out.println(log.substring(log.indexOf("[")+1, log.lastIndexOf("]")));
        int a = log.indexOf("[");

    }
}