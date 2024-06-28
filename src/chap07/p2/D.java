package chap07.p2;

import chap07.p1.A;

public class D extends A {

    public D() {
        //A 생성자 호출
        super();
    }

    //메소드 선언
    public void method1(){
        //A 필드값 변경
        this.field = "value";
        //A 메소드 호출
        this.method();
    }

    public void method2(){
        //직접 개체 생성해서 사용하는 것은 안됨
//        A  = new A();
//        a.field = "value";
//        a.method();
    }

}
