package Study_Myself;
public class SingletonEx {
    private static SingletonEx instance;

    private String companyName;
    private String companyAddr;

    private SingletonEx() {
    }

    public static synchronized SingletonEx getInstance() {
        if (instance == null) {
            synchronized (SingletonEx.class) {
                if (instance == null) {
                    instance = new SingletonEx();
                }
            }
        }
        return instance;
    }

    // getter, setter

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr;
    }
}
