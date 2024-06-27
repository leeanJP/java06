package chap06.p1;

public class A {
    //public 접근 제한을 갖는 필드
    public int field1;

    int field2;

    private int field3;

    public A() {
        field1 = 1;
        field2 = 2;
        field3 = 3;

        //클래스 내부의 경우 접근제어자의 영향을 받지 않음
        method1();
        method2();
        method3();
    }

    public  void method1() {}
    void method2() {}
    private  void method3() {}

}
