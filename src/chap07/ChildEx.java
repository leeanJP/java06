package chap07;

public class ChildEx {
    public static void main(String[] args) {
        //자식 객체 생성
        Child child = new Child();

        //자동 타입 변환
        Parent parent = child;

        //부모타입으로 자동 타입 변환된 이후에는 부모클래스에 선언된
        //필드와 메소드만 접근이 가능하다
        //자식 클래스에 오버라이딩된 메소드가 있다면
        //부모 메소드 대신 오버라이딩된 메소드가 호출된다.
        parent.method1();
        parent.method2();
        //parent.method3();
    }
}
