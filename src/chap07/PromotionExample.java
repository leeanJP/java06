package chap07;

class A {
}


class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class PromotionExample{
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //자동 타입 변환
        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        //자동 타입변환 X 상속관계가 아님
//        B b3 = e;
//        C c3 = d;
    }
}