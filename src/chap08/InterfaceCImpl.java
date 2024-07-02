package chap08;

public class InterfaceCImpl implements InterfaceC {
    @Override
    public void methodC() {
        System.out.println("interface C methodC 실행");
    }

    @Override
    public void methodA() {
        System.out.println("interface A methodA 실행");

    }

    @Override
    public void methodB() {
        System.out.println("interface B methodB 실행");

    }
}
