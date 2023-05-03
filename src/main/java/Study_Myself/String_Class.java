package Study_Myself;

public class String_Class {
    public static void main(String[] args) {
        String str = "   안 녕 하  살  법 ! ! ";
        String str1 = " H e llo World! ";

        //1. length()
        //문자열의 길이를 반환
        System.out.println("length() : " + str.length());

        //2. charAt(int index)
        //인덱스에 해당하는 문자 반환
        for (int i = 0; i < str.length(); i++) {
            System.out.println("charAt() : " + i + "번 인덱스 " + str.charAt(i));
        }

        //3.indexOf(String str)
        //주어진 문자열이 처음 나타나는 위치의 인덱스를 반환
        System.out.println("indexOf() : " + "'!' 문자의 처음 위치는" + str.indexOf("!") + "번 인덱스 입니다.");

        //4. lastIndexOf(String str)
        //주어진 문자열이 마지막으로 나타나는 위치의 인덱스를 반환
        System.out.println("lastIndexOf() : " + "'!' 문자의 마지막 위치는" + str.lastIndexOf("!") + "번 인덱스 입니다.");

        //5. substring(int beginIndex, int endIndex)
        //(시작위치, 끝 위치) 에서 시작위치 부터 끝 위치 까지의 문자열을 반환
        System.out.println("substring() : " + "인덱스 3번부터 6번까지 출력(" + str.substring(3, 6) + ")");

        //6. replace(char oldChar, char newChar)
        // 주어진 문자열에서 oldChar를 newChar로 바꾼 문자열을 반환
        System.out.println("replace() : " + "공백을 * 표시로 바꾸기 (" + str.replace(' ', '*') + ")");

        //7. replaceAll(String regex, String replacement)
        // 주어진 정규 표현식에 해당하는 문자열을 모두 찾아 새로운 문자열로 대체한 후 결과 문자열을 반환
        System.out.println("replaceAll() : " + "공백을 + 표시로 바꾸기 (" + str.replace(" ", "+") + ")");

        //replace() 메소드와 replaceAll() 메소드의 차이는 문자(replace)와 문자열(replaceAll), 비정규식(replace)과 정규식(replaceAll) 이다.
        //replace 는 단순히 문자를 바꿀 뿐이지만, replaceAll은 정규식 내의 문자열 전체를 바꾼다.

        //8. toUpperCase()
        // 문자열을 모두 대문자로 변환한 문자열을 반환
        System.out.println("toUpperCase() : " + str1.toUpperCase());

        //9.toLowerCase()
        //  문자열을 모두 소문자로 변환한 문자열을 반환
        System.out.println("toLowerCase() : " + str1.toLowerCase());

        //10. trim()
        //문자열의 앞뒤 공백을 제거한 문자열을 반환
        System.out.println("trim() : " + str.trim());

        //11. split(String regex)
        //정규 표현식에 해당하는 구분자를 사용하여 문자열을 분할한 문자열 배열을 반환
        System.out.print("split() : " + "split을 이용해서 공백을 제거해보자!  ==> ");
        String str2[] = str.split(" ");
        for (int i = 0; i < str2.length; i++)
            System.out.print(str2[i]);
        System.out.println();

        //12.compareTo()
        //1번 문자열.compareTo(2번 문자열)
        //1번 문자열과 2번 문자열을 문자열을 사전식 순서로 비교하여 순서를 반환합
        //같으면 0, str1이 더 작으면 -1, str1이 더 크면 1 이다.
        //아스키 코드로 분석하기에 정렬 같은 곳에 사용할 수 있다.
        int result = str.compareTo(str1);
        System.out.println("compareTo() : " + str + "의 사전적 순서는 " + str1 + "보다 얼마나 차이 날까? ==> " + result);


        //13. contains.()
        //문자열에 특정 문자열이 포함되어 있는지 여부를 반환
        //특정 문자열이 있다면 true, 없다면 false
        System.out.println("contains.() : " + str + "에 공백이 있나요? ==> " + str.contains(" "));

        //14. startsWith()
        //문자열이 특정 문자열 또는 문자로 시작하는지 여부를 검사
        //특정 문자열로 시작하면 true, 시작하지 않으면 false.
        boolean result1 = str1.startsWith("Hello");
        System.out.println("startsWith() : " + str1 + "의 시작 값이 Hello 인가요? ==> " + result1);

        //15. endsWith()
        //문자열이 특정 문자열 또는 문자로 끝나는지 여부를 검사
        //특정 문자열로 끝나면 true, 시작하지 않으면 false.
        result1 = str1.endsWith(" ");
        System.out.println("endsWith() : " + str1 + "의 끝 값이 공백 인가요? ==> " + result1);
    }
}

