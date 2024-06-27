package chap06;

public class Korean {
    //final 키워드

    // 인스턴스 필드 , 정적 필드의 값은 언제든지 변경이 가능함
    // final로 선언된 필드는 값을 변경할 수 없다.
    // final로 선언된 필드는 상수 취급을 받는다.
    // 관례상 final 변수는 대문자로 변수명을 작성한다.

    // final 필드에 초기값을 주는 방법은
    // 1. 필드 선언시에 초기값 대입
    // 2. 생성자에서 초기값을 대입

    final String NATION = "대한민국";
    final String SSN;
    String name;

    public Korean(String SSN , String name) {
        this.SSN = SSN;
        this.name = name;
    }



}
