package chap08;

public interface Service {
    //디폴트 메소드
    default void defaultMethod1(){
        System.out.println("default method 1");
        defaultCommon();
    }
    default void defaultMethod2(){
        System.out.println("default method 2");
        defaultCommon();
    }

    //private 메소드
    private void defaultCommon(){
        System.out.println("defaultMethod 중복 코드 A");
        System.out.println("defaultMethod 중복 코드 B");
    }
    //static 메소드
    static void staticMethod1(){
        System.out.println("static method 1");
        staticCommon();
    }
    static void staticMethod2(){
        System.out.println("static method 2");
        staticCommon();
    }


    //private static 메소드
    private static void staticCommon(){
        System.out.println("staticMethod 중복코드 C");
        System.out.println("staticMethod 중복코드 D");
    }



}
