package chap07;

public class Phone {
    //상속
    //기본 클래스(부모 , 슈퍼 클래스)의 필드와 메소드를 새로운 클래스(자식 , 서브 클래스) 가 상속받아
    //재사용 하는 기능

    //상속 사용법
    //클래스명 옆에 extends 키워드 사용해서 상속 받음

    //부모 생성자 호출
    //자식 객체를 생성하면 부모객체가 먼저 생성되고 자식 객체가 생성된다.

    //상속의 규칙
    // 자바는 단일 상속만 지원한다.
    // 자바의 모든 클래스는 Object 를 상속받는다
    // 부모 클래스의 private 멤버는 자식 클래스에서 접근할 수 없다.

    //메소드 오버라이딩
    //자식 클래스에서 부모 클래스에 있는 메소드를 재정의해서 사용하는 것
    // 부모 메소드의 선언부(리턴타입, 메소드이름, 매개변수) 동일해야한다.
    // 접근 제한을 더 강하게 할 수 없다.
    // 새로운 예외를 throws 할 수 없다.

    //부모 메소드 호출
    //부모 메소드에 100라인 자식 메소드에서 +한줄 추가

    //final 클래스
    //class final 키워드를 붙이면 더이상 상속할 수 없다.

    //final 메소드
    //메소드에 final 키워드를 붙이면 더이상 오버라이딩 할 수 없다.

    //protected 접근 제한자
    //같은 패키지이거나 자식 객체만 사용가능 ㅔ

    //타입 변환
    //상속 관계에 있는 클래스 사이에서 발생

    //강제 타입변환
    // 자식 > 부모타입으로는 자동변환
    // 부모 > 자식타입으로 변환은 자동으로 X
    // 강제 타입 변환은 가능하다.


    //다형성
    //인터페이스나 부모 클래스 타입을 사용해서 여러 다른 객체를 처리할 수 있는 능력을 의미한다.
    //코드의 유연성, 재사용성, 확장성을 높여준다.


    //객체 타입 확인
    //매개변수의가 실제로 어떤 객체가 매개값으로 제공되었는지 확인하는 방법
    //boolean result = 객체 instanceof  타입;

    //추상화 abstract
    //공통된 특성을 추출하는 것

    //추상화 목적
    // 복잡성 감소 : 복잡한 시스템을 단순화해서 관리 할 수 있다.
    // 재사용성 증가 : 공통적인 기능을 추상화 해서 여러 클래스에 재사용 할 수있다.

    // 추상화 클래스 선언 방법
    // public abstract class 클래스명 {}


    //필드
    public String model;
    public String color;

    //생성자
    public Phone(String model, String color){
        this.model = model;
        this.color = color;
        System.out.println("Phone 생성자 실행");
    }

    //메소드
    public  void bell(){
        System.out.println("Bell");
    }

    public  final void off(){
        System.out.println("Off");
    }

    public void sendVoice(String message){
        System.out.println("자기 : " + message);
    }

    public  void recordVoice(String message){
        System.out.println("상대방 : " + message);
    }

    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
