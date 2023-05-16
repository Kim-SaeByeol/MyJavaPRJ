package Ex11;

public class Kass extends Beer{
    String flavor;
    int ABV = 6;

    Kass(String model, String flavor){
        super("생맥주", model);
        //부모 Beer 클래스의 인스턴스 변수를 가져옴
        this.model = model;
        this.flavor = flavor;
        this.ABV = ABV;
    }

    public void flavordrink() {
        System.out.println(model + " 맥주의 " + flavor + " 맛을 마십니다.");
    }

    public String getFlavor() {
        return flavor;
    }
    public int getABV() {
        return ABV;
    }
}
