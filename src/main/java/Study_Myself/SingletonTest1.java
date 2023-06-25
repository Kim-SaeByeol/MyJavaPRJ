package Study_Myself;

public class SingletonTest1 {
    public static void main(String[] args) {
        SingletonEx companyInfo1 = SingletonEx.getInstance();

        // setter로 접근
        companyInfo1.setCompanyName("회사명");
        companyInfo1.setCompanyAddr("회사주소");

        // SingletonEx 인스턴스를 SingletonTest2에서도 사용할 수 있도록 companyInfo1을 전달
        SingletonTest2.setSingletonInstance(companyInfo1);

        // SingletonTest2 실행
        SingletonTest2.main(args);
    }
}




