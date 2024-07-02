package chap08;

public class ExtendsEx {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        //ia.methodB();

        InterfaceB ib = impl;
        ib.methodB();
        //ib.methodA();

        InterfaceC ic = impl;
        ic.methodC();
        ic.methodA();
        ic.methodB();



    }
}
