package Ex11;

public class Beer {
    String type;
    String model;

    public Beer(String type, String model){
        this.type = type;
        this.model = model;
    }

    public void drink() {
        System.out.println("마십니다.");
    }

    public void mix() {
        System.out.println("섞습니다.");
    }

    public String getType() {
        return type;
    }

    public String getModel(){
        return model;
    }
}
