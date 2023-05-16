package Ex11;

public class Kass_Beer_Ex {
    public static void main(String[] args) {
        //소맥 객체 생성
        Kass kass = new Kass("카스", "과일");

        //Beer 클래스로 부터 상속 받음
        System.out.println("타입 : " + kass.getType());
        System.out.println("알콜 도수 : " + kass.getABV());

        //Kass 클래스로 부터 상속 받은 필드
        System.out.println("맛 : " + kass.getFlavor());

        //Kass 클래스 메서드 호출
        kass.flavordrink();
    }
}
