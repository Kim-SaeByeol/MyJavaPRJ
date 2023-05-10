public class test {


    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";
        String st[] = log.split(" ");

        //1번 문제. IP만 출력함.
        System.out.println(st[0]);

        //2번 문제, 순서대로 봐서 GET 이라는 문자가 있으면 출력할 것.
        String ch = "GET";
        int index = log.indexOf(ch);
        System.out.println(log.substring(index, index + ch.length()));
    }
}
