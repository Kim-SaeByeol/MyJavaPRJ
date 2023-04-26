package Study_Myself;


//배열과 유사한 방식이지만 요소를 추가하거나 삭제할 수 있다는 강점이 있다.
//가변적인 크기를 가지기에 고정적인 크기를 지닌 배열과의 큰 차이점이 있음.
import java.util.ArrayList;

//Arrays 는 배열의 정렬, 복사, 비교 등의 작업을 수행할 때 쓸 수 있는 다양한 메서드를 포함하고 있음.
// 배열을 좀 더 쉽게 사용할 수 있게 만들어주는 패키지 클래스.
import java.util.Arrays;

//List 인터페이스는 순서가 있는 요소들의 모임을 나타내는 자바 컬렉션 인터페이스 중 하나.
import java.util.List;
public class Array_List {
    public static void main(String[] args) {
        // 타입을 지정해서 선언해야함. 여기서는 정수 형태인 Integer
        //<Integer>는 제네릭 타입을 나타내며, 해당 리스트가 정수형 요소들을 포함한다는 것을 의미함.
        List<Integer> integers1 = new ArrayList<Integer>();

        // 타입 생략 가능
        // 7 버전 이후부터 제공하는 다이아몬드 연산자를 통해
        // Javac(컴파일러) 과정에서 자동으로 제네릭 타입을 추론하여 제네릭 타입 형태를 가짐.
        List<Integer> integers2 = new ArrayList<>();


        // 초기 용량(Capacity) 설정
        // ArrayList 는 가변적인 크기를 가진 배열로 .add 를 통해 계속해서 배열의 크기를 키울 수 있음.
        // 하지만, 배열의 크기를 증가시키는 것이 생각보다 비용이 많이 듬 (계산을 많이 함.)
        // 따라서 초기 용량(Capacity)을 설정하여 계산을 더 적게 하도록 유도함.
        List<Integer> integers3 = new ArrayList<>(10);

        // 다른 Collection값으로 초기화
        // integers1 의 형태를 복사하여 integers4 리스트를 선언함.
        // 복사한 형태이기에 아예 다른 객체이며 integers1 의 값을 변경하더라도 이미 할당 받은 integers4의 값은 변하지 않음.
        List<Integer> integers4 = new ArrayList<>(integers1);

        // Arrays.asList() 메서드 사용으로 값을 지정할 수 있음.
        // 이 메서드는 자바 패키지 클래스인 Arrays 메서 제공하는 메서드임.
        // 대신 가변적인 크기를 장점으로 가지고 있는 ArrayList 와는 어울리지 않음.
        // 따라서, 값을 입력 받을 때는 .add 통해 입력 받아 가변적인 특징을 유지하는 것이 바람직함.
        List<Integer> integers5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    }
}