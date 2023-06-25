package Study_Myself;

public class SingletonTest2 {
    private static SingletonEx singletonInstance;

    public static void setSingletonInstance(SingletonEx instance) {
        singletonInstance = instance;
    }

    public static void main(String[] args) {
        if (singletonInstance != null) {
            // getter로 접근
            System.out.println("companyName: " + singletonInstance.getCompanyName());
            System.out.println("companyAddr: " + singletonInstance.getCompanyAddr());
        } else {
            System.out.println("SingletonEx 인스턴스가 초기화되지 않았습니다.");
        }
    }
}
