package Study_Myself;
class Cal{

    public int sum(int a, int b){
        return a + b;
    }
}
public class Test_Quiz_extends extends Cal {
    @Override
    public int sum(int a, int b){
        return a * b;
    }
}
