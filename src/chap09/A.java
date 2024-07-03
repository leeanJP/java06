package chap09;

public class A {

    //일반적으로 클래스 작성 할 때
    //여러 클래스와 관계를 맺는 경우에  독립적으로 선언을 한다.

    //특정 클래스만 관계를 맺는 경우에는
    //중첩 클래스로 선언하는 것이 유지보수에 도움이 된다.

    //중첩 클래스는 클래스 내부에 선언 한 클래스

    class B {
        int field1 = 1;

        //static filed java 17부터 허용
        static int field2 = 2;

        B(){
            System.out.println("B 생성자 실행");
        }

        void method1(){
            System.out.println("B 메소드 1 실행");
        }
        static void method2(){
            System.out.println("B 메소드 2 실행");
        }
    }

    void useB(){
        //B 객체 생성
        B b =new B();
        System.out.println(b.field1);

        b.method1();

        //B 클래스의 static field , method 사용
        System.out.println(b.field2);
        B.method2();


    }

}
