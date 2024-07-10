package chap13;

//숫자만 받아 계산하는 계산기 클래스 모듈
public class Calculator<T extends Number> {
    //제네릭을 Number 클래스와 그 하위 타입만 받도록 제한한다.
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}

    public static void main(String[] args) {
        //제네릭에 아무 타입이나 할당 가능
        Calculator<Integer> cal1 = new Calculator<>();
        Calculator<Number> cal2 = new Calculator<>();
        Calculator<Double> cal3 = new Calculator<>();

        //Number 자료형만 들어오도록 하고 문자열이나 다른 클래스 자료형이 들어오면 안되게 하고싶다.

    }

}
